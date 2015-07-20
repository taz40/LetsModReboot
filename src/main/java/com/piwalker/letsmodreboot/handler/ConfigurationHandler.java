package com.piwalker.letsmodreboot.handler;

import com.piwalker.letsmodreboot.referance.Referance;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by SamuelPiWalker on 7/20/2015.
 */
public class ConfigurationHandler {

    static boolean configValue;
    public static Configuration configuration;

    public static void init(File configFile){
        //create the configuration object from a given configuration file;
        if(configuration == null)
            configuration = new Configuration(configFile);
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event){
        if(event.modID.equalsIgnoreCase(Referance.MOD_ID)){
            loadConfiguration();
        }
    }

    public static void loadConfiguration(){
        configValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "This is an example configuration value.");
        if(configuration.hasChanged()) {
            configuration.save();
        }
    }


}

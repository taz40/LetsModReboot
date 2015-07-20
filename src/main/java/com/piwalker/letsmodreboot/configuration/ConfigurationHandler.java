package com.piwalker.letsmodreboot.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by SamuelPiWalker on 7/20/2015.
 */
public class ConfigurationHandler {

    static boolean configValue;

    public static void init(File configFile){
        //create the configuration object from a given configuration file;
        Configuration configuration = new Configuration(configFile);

        try{
            //load config file
            configuration.load();

            //read in proporities
            configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "This is an example config value").getBoolean(true);
        }catch(Exception e){
            //log exception
        }finally{
            //save the config file
            configuration.save();
        }

        System.out.println(configValue);
    }

}

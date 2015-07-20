package com.piwalker.letsmodreboot;

import com.piwalker.letsmodreboot.handler.ConfigurationHandler;
import com.piwalker.letsmodreboot.init.ModBlocks;
import com.piwalker.letsmodreboot.init.ModItems;
import com.piwalker.letsmodreboot.proxy.IProxy;
import com.piwalker.letsmodreboot.referance.Referance;
import com.piwalker.letsmodreboot.utility.LogHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import jdk.nashorn.internal.runtime.regexp.joni.Config;

@Mod(modid= Referance.MOD_ID, name=Referance.MOD_NAME, version=Referance.MOD_VERSION, guiFactory = Referance.GUI_FACTORY_CLASS)
public class LetsModReboot {

    @Mod.Instance(Referance.MOD_ID)
    public static LetsModReboot instance;

    @SidedProxy(clientSide = Referance.CLIENT_PROXY, serverSide = Referance.SERVER_PROXY)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        ConfigurationHandler.loadConfiguration();
        ModItems.init();
        ModBlocks.init();
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event){
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
    }
}

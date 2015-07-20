package com.piwalker.letsmodreboot;

import com.piwalker.letsmodreboot.configuration.ConfigurationHandler;
import com.piwalker.letsmodreboot.proxy.IProxy;
import com.piwalker.letsmodreboot.referance.Referance;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Referance.MOD_ID, name=Referance.MOD_NAME, version=Referance.MOD_VERSION)
public class LetsModReboot {

    @Mod.Instance(Referance.MOD_ID)
    public static LetsModReboot instance;

    @SidedProxy(clientSide = Referance.CLIENT_PROXY, serverSide = Referance.SERVER_PROXY)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event){

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}

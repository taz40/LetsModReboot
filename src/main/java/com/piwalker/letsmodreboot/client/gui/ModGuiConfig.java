package com.piwalker.letsmodreboot.client.gui;

import com.piwalker.letsmodreboot.handler.ConfigurationHandler;
import com.piwalker.letsmodreboot.referance.Referance;
import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.IConfigElement;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

import java.util.List;

/**
 * Created by SamuelPiWalker on 7/20/2015.
 */
public class ModGuiConfig extends GuiConfig {


    public ModGuiConfig(GuiScreen parentScreen) {
        super(parentScreen,
                new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Referance.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
    }
}

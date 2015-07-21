package com.piwalker.letsmodreboot.proxy;

import com.piwalker.letsmodreboot.client.settings.Keybindings;
import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.settings.KeyBinding;

/**
 * Created by SamuelPiWalker on 7/19/2015.
 */
public class ClientProxy extends  CommonProxy {
    @Override
    public void registerKeyBindings() {
        ClientRegistry.registerKeyBinding(Keybindings.charge);
        ClientRegistry.registerKeyBinding(Keybindings.release);
    }
}

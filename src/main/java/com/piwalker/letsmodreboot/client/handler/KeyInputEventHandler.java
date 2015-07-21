package com.piwalker.letsmodreboot.client.handler;

import com.piwalker.letsmodreboot.client.settings.Keybindings;
import com.piwalker.letsmodreboot.referance.Key;
import com.piwalker.letsmodreboot.utility.LogHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

/**
 * Created by SamuelPiWalker on 7/20/2015.
 */
public class KeyInputEventHandler {

    private static Key getPressedKeyBinding(){
        if(Keybindings.charge.isPressed()) {
            return Key.CHARGE;
        }else if(Keybindings.release.isPressed()){
            return Key.RELEASE;
        }
        return Key.UNKNOWN;
    }

    @SubscribeEvent
    public void handleKeyInputEvent(InputEvent.KeyInputEvent event){
        LogHelper.info(getPressedKeyBinding());
    }
}

package com.piwalker.letsmodreboot.init;

import com.piwalker.letsmodreboot.item.ItemLMRB;
import com.piwalker.letsmodreboot.item.ItemMapleLeaf;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by SamuelPiWalker on 7/20/2015.
 */
public class ModItems {
    public static final ItemLMRB MapleLeaf = new ItemMapleLeaf();

    public static void init(){
        GameRegistry.registerItem(MapleLeaf, "mapleLeaf");
    }
}

package com.piwalker.letsmodreboot.init;

import com.piwalker.letsmodreboot.block.BlockFlag;
import com.piwalker.letsmodreboot.block.BlockLMRB;
import com.piwalker.letsmodreboot.referance.Referance;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by SamuelPiWalker on 7/20/2015.
 */

@GameRegistry.ObjectHolder(Referance.MOD_ID)
public class ModBlocks {
    public static final BlockLMRB flag = new BlockFlag();

    public static void init(){
        GameRegistry.registerBlock(flag, "flag");
    }
}

package com.piwalker.letsmodreboot.creativetab;

import com.piwalker.letsmodreboot.init.ModItems;
import com.piwalker.letsmodreboot.referance.Referance;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by SamuelPiWalker on 7/20/2015.
 */
public class CreativeTabLMRB {
    public static final CreativeTabs LMRB_TAB = new CreativeTabs(Referance.MOD_ID.toLowerCase()) {
        @Override
        public Item getTabIconItem() {
            return ModItems.MapleLeaf;
        }
    };
}

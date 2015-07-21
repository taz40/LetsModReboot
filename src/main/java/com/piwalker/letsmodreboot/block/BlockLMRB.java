package com.piwalker.letsmodreboot.block;

import com.piwalker.letsmodreboot.creativetab.CreativeTabLMRB;
import com.piwalker.letsmodreboot.referance.Textures;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

/**
 * Created by SamuelPiWalker on 7/20/2015.
 */
public class BlockLMRB extends Block {

    public BlockLMRB(Material material){
        super(material);
        this.setCreativeTab(CreativeTabLMRB.LMRB_TAB);
    }

    public BlockLMRB(){
        this(Material.rock);
    }

    @Override
    public String getUnlocalizedName(){
        return String.format("tile.%s%s", Textures.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister){
        blockIcon = iconRegister.registerIcon(String.format("%s",getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

}

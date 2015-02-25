package com.mattdahepic.mobdropexchangeorb.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemMobEssence extends Item {
    public ItemMobEssence () {
        super();
        this.setUnlocalizedName("mobEssence");
        this.setMaxStackSize(64);
        this.setCreativeTab(CreativeTabs.tabAllSearch);
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("mobdropexchangeorb:mobEssence");
    }
}

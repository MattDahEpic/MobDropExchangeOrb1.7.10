package com.mattdahepic.mobdropexchangeorb.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemMobDropExchangeOrb extends Item {
    public ItemMobDropExchangeOrb () {
        super();
        this.setUnlocalizedName("mobDropExchangeOrb");
        this.setMaxStackSize(1);
        this.setCreativeTab(CreativeTabs.tabAllSearch);
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("mobdropexchangeorb:mobDropExchangeOrb");
    }
}

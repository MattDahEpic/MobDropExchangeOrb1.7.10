package com.mattdahepic.mobdropexchangeorb.item;

import com.mattdahepic.mobdropexchangeorb.config.Config;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemMobDropExchangeOrb extends Item {
    public ItemMobDropExchangeOrb () {
        super();
        this.setUnlocalizedName("mobDropExchangeOrb");
        this.setMaxStackSize(1);
        this.setCreativeTab(CreativeTabs.tabAllSearch);
        if (Config.orbHasDurability && Config.orbDurability > 1) { //if durability on and not one use
            this.setMaxDamage(Config.orbDurability-1);
        }
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("mobdropexchangeorb:mobDropExchangeOrb");
    }
    @Override
    public boolean doesContainerItemLeaveCraftingGrid (ItemStack stack) {
        return false;
    }
    @Override
    public ItemStack getContainerItem (ItemStack stack) {
        if (isDamageable()) { //if more than one use, but not infinite
            return new ItemStack(stack.getItem(),1,stack.getItemDamage()+1);
        } else if (Config.orbDurability == 1) {
            return null;
        } else { //infinite, return input
            return stack;
        }
    }
}

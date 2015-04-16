package com.mattdahepic.mobdropexchangeorb.recipe;

import com.mattdahepic.mobdropexchangeorb.MobDropExchangeOrb;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraftforge.oredict.OreDictionary;

import java.util.ArrayList;
import java.util.List;

public class MusicDiskConversionRecipeHandler {
    public static ItemStack disk1 = new ItemStack(Items.record_13);
    public static ItemStack disk2 = new ItemStack(Items.record_cat);
    public static ItemStack disk3 = new ItemStack(Items.record_blocks);
    public static ItemStack disk4 = new ItemStack(Items.record_chirp);
    public static ItemStack disk5 = new ItemStack(Items.record_far);
    public static ItemStack disk6 = new ItemStack(Items.record_mall);
    public static ItemStack disk7 = new ItemStack(Items.record_mellohi);
    public static ItemStack disk8 = new ItemStack(Items.record_stal);
    public static ItemStack disk9 = new ItemStack(Items.record_strad);
    public static ItemStack disk10 = new ItemStack(Items.record_ward);
    public static ItemStack disk11 = new ItemStack(Items.record_11);
    public static ItemStack disk12 = new ItemStack(Items.record_wait);
    public static void registerRecipes () {
        GameRegistry.addRecipe(getDiskConvert(disk1,disk2));
        GameRegistry.addRecipe(getDiskConvert(disk2,disk3));
        GameRegistry.addRecipe(getDiskConvert(disk3,disk4));
        GameRegistry.addRecipe(getDiskConvert(disk4,disk5));
        GameRegistry.addRecipe(getDiskConvert(disk5,disk6));
        GameRegistry.addRecipe(getDiskConvert(disk6,disk7));
        GameRegistry.addRecipe(getDiskConvert(disk7,disk8));
        GameRegistry.addRecipe(getDiskConvert(disk8,disk9));
        GameRegistry.addRecipe(getDiskConvert(disk9,disk10));
        GameRegistry.addRecipe(getDiskConvert(disk10,disk11));
        GameRegistry.addRecipe(getDiskConvert(disk11,disk12));
        GameRegistry.addRecipe(getDiskConvert(disk12,disk1));
    }
    public static void removeRecipes () {
        CraftingManager.getInstance().getRecipeList().remove(getDiskConvert(disk1,disk2));
        CraftingManager.getInstance().getRecipeList().remove(getDiskConvert(disk2,disk3));
        CraftingManager.getInstance().getRecipeList().remove(getDiskConvert(disk3,disk4));
        CraftingManager.getInstance().getRecipeList().remove(getDiskConvert(disk4,disk5));
        CraftingManager.getInstance().getRecipeList().remove(getDiskConvert(disk5,disk6));
        CraftingManager.getInstance().getRecipeList().remove(getDiskConvert(disk6,disk7));
        CraftingManager.getInstance().getRecipeList().remove(getDiskConvert(disk7,disk8));
        CraftingManager.getInstance().getRecipeList().remove(getDiskConvert(disk8,disk9));
        CraftingManager.getInstance().getRecipeList().remove(getDiskConvert(disk9,disk10));
        CraftingManager.getInstance().getRecipeList().remove(getDiskConvert(disk10,disk11));
        CraftingManager.getInstance().getRecipeList().remove(getDiskConvert(disk11,disk12));
        CraftingManager.getInstance().getRecipeList().remove(getDiskConvert(disk12,disk1));
    }
    private static IRecipe getDiskConvert (ItemStack oldDisk, ItemStack newDisk) {
        List<ItemStack> input = new ArrayList<ItemStack>();
        input.add(new ItemStack(MobDropExchangeOrb.itemMobDropExchangeOrb, 1, OreDictionary.WILDCARD_VALUE));
        input.add(oldDisk);
        return new ShapelessRecipes(newDisk,input);
    }
}

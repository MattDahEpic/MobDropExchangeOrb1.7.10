package com.mattdahepic.mobdropexchangeorb.recipe;

import com.mattdahepic.mobdropexchangeorb.MobDropExchangeOrb;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.ShapedRecipes;

public class OrbRecipeHandler {
    public static void registerRecipes (boolean hardMode) {
        if (hardMode) {
            GameRegistry.addRecipe(getOrbRecipe(new ItemStack(Items.nether_star)));
        } else {
            GameRegistry.addRecipe(getOrbRecipe(new ItemStack(Items.diamond)));
        }
    }
    public static void removeRecipes () {
        CraftingManager.getInstance().getRecipeList().remove(getOrbRecipe(new ItemStack(Items.nether_star)));
        CraftingManager.getInstance().getRecipeList().remove(getOrbRecipe(new ItemStack(Items.diamond)));
    }
    private static IRecipe getOrbRecipe (ItemStack centerItem) {
        ItemStack quartz = new ItemStack(Items.quartz);
        ItemStack enderEye = new ItemStack(Items.ender_eye);
        ItemStack[] input = new ItemStack[9];
        input[0] = quartz;
        input[1] = enderEye;
        input[2] = quartz;
        input[3] = enderEye;
        input[4] = centerItem;
        input[5] = enderEye;
        input[6] = quartz;
        input[7] = enderEye;
        input[8] = quartz;
        return new ShapedRecipes(3,3,input,new ItemStack(MobDropExchangeOrb.itemMobDropExchangeOrb));
    }
}

package com.mattdahepic.mobdropexchangeorb.recipe;

import com.mattdahepic.mobdropexchangeorb.MobDropExchangeOrb;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class RecipeMobDropExchangeOrb {
    public RecipeMobDropExchangeOrb() {}
    public static void registerRecipes() {
        GameRegistry.addShapedRecipe(new ItemStack(MobDropExchangeOrb.itemMobDropExchangeOrb),getRecipe());
    }
    private static Object[] getRecipe() {
        ItemStack quartz = new ItemStack(Items.quartz);
        ItemStack diamond = new ItemStack(Items.diamond);
        ItemStack ender_eye = new ItemStack(Items.ender_eye);
        Object[] recipe = new Object[9];
        recipe[0] = "aba";
        recipe[1] = "bcb";
        recipe[2] = "aba";
        recipe[3] = 'a';
        recipe[4] = quartz;
        recipe[5] = 'b';
        recipe[6] = diamond;
        recipe[7] = 'c';
        recipe[8] = ender_eye;
        return recipe;
    }
}

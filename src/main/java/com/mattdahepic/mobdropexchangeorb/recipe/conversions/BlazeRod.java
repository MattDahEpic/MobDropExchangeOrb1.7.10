package com.mattdahepic.mobdropexchangeorb.recipe.conversions;

import com.mattdahepic.mobdropexchangeorb.MobDropExchangeOrb;
import com.mattdahepic.mobdropexchangeorb.config.Config;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BlazeRod {
    public BlazeRod() {}
    public static void registerRecipes() {
        GameRegistry.addShapelessRecipe(new ItemStack(MobDropExchangeOrb.itemMobEssence, Config.blazeEssence),convert()); //turn into essence
        GameRegistry.addShapelessRecipe(new ItemStack(Items.blaze_rod,2),produce()); //dupilicate blaze rods
    }
    private static Object[] convert () {
        ItemStack orb = new ItemStack(MobDropExchangeOrb.itemMobDropExchangeOrb.setContainerItem(MobDropExchangeOrb.itemMobDropExchangeOrb));
        ItemStack blaze_rod = new ItemStack(Items.blaze_rod);
        Object[] recipe = new Object[2];
        recipe[0] = orb;
        recipe[1] = blaze_rod;
        return recipe;
    }
    private static Object[] produce () {
        ItemStack blaze_rod = new ItemStack(Items.blaze_rod);
        ItemStack essence = new ItemStack(MobDropExchangeOrb.itemMobEssence);
        Object[] recipe = new Object[Config.blazeEssence+1];
        recipe[0] = blaze_rod;
        for (int i = 1; i <= Config.blazeEssence; i++) {
            recipe[i] = essence;
        }
        return recipe;
    }
}

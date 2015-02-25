package com.mattdahepic.mobdropexchangeorb.recipe.conversions.witchdrops;

import com.mattdahepic.mobdropexchangeorb.MobDropExchangeOrb;
import com.mattdahepic.mobdropexchangeorb.config.Config;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class GlassBottle {
    public GlassBottle () {}
    public static void registerRecipes() {
        GameRegistry.addShapelessRecipe(new ItemStack(MobDropExchangeOrb.itemMobEssence, Config.glassBottleEssence), convert()); //turn into essence
        GameRegistry.addShapelessRecipe(new ItemStack(Items.glass_bottle,2),produce());
    }
    private static Object[] convert () {
        ItemStack orb = new ItemStack(MobDropExchangeOrb.itemMobDropExchangeOrb.setContainerItem(MobDropExchangeOrb.itemMobDropExchangeOrb));
        ItemStack arrow = new ItemStack(Items.glass_bottle);
        Object[] recipe = new Object[2];
        recipe[0] = orb;
        recipe[1] = arrow;
        return recipe;
    }
    private static Object[] produce () {
        ItemStack arrow = new ItemStack(Items.glass_bottle);
        ItemStack essence = new ItemStack(MobDropExchangeOrb.itemMobEssence);
        Object[] recipe = new Object[Config.glassBottleEssence+1];
        recipe[0] = arrow;
        for (int i = 1; i <= Config.glassBottleEssence; i++) {
            recipe[i] = essence;
        }
        return recipe;
    }
}

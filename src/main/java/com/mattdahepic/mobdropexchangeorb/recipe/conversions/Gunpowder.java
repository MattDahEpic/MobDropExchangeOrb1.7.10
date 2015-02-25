package com.mattdahepic.mobdropexchangeorb.recipe.conversions;

import com.mattdahepic.mobdropexchangeorb.MobDropExchangeOrb;
import com.mattdahepic.mobdropexchangeorb.config.Config;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Gunpowder {
    public Gunpowder () {}
    public static void registerRecipes() {
        GameRegistry.addShapelessRecipe(new ItemStack(MobDropExchangeOrb.itemMobEssence, Config.gunpowderEssence),convert()); //turn into essence
        GameRegistry.addShapelessRecipe(new ItemStack(Items.gunpowder,2),produce());
    }
    private static Object[] convert () {
        ItemStack orb = new ItemStack(MobDropExchangeOrb.itemMobDropExchangeOrb.setContainerItem(MobDropExchangeOrb.itemMobDropExchangeOrb));
        ItemStack gunpowder = new ItemStack(Items.gunpowder);
        Object[] recipe = new Object[2];
        recipe[0] = orb;
        recipe[1] = gunpowder;
        return recipe;
    }
    private static Object[] produce () {
        ItemStack gunpowder = new ItemStack(Items.gunpowder);
        ItemStack essence = new ItemStack(MobDropExchangeOrb.itemMobEssence);
        Object[] recipe = new Object[Config.gunpowderEssence+1];
        recipe[0] = gunpowder;
        for (int i = 1; i <= Config.gunpowderEssence; i++) {
            recipe[i] = essence;
        }
        return recipe;
    }
}

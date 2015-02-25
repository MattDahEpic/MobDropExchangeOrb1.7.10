package com.mattdahepic.mobdropexchangeorb.recipe.conversions;

import com.mattdahepic.mobdropexchangeorb.MobDropExchangeOrb;
import com.mattdahepic.mobdropexchangeorb.config.Config;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class MagmaCream {
    public MagmaCream () {}
    public static void registerRecipes () {
        GameRegistry.addShapelessRecipe(new ItemStack(MobDropExchangeOrb.itemMobEssence, Config.magmaCreamEssence),convert()); //turn into essence
        GameRegistry.addShapelessRecipe(new ItemStack(Items.magma_cream,2),produce());
    }
    private static Object[] convert () {
        ItemStack orb = new ItemStack(MobDropExchangeOrb.itemMobDropExchangeOrb.setContainerItem(MobDropExchangeOrb.itemMobDropExchangeOrb));
        ItemStack magma_cream = new ItemStack(Items.magma_cream);
        Object[] recipe = new Object[2];
        recipe[0] = orb;
        recipe[1] = magma_cream;
        return recipe;
    }
    private static Object[] produce () {
        ItemStack magma_cream = new ItemStack(Items.magma_cream);
        ItemStack essence = new ItemStack(MobDropExchangeOrb.itemMobEssence);
        Object[] recipe = new Object[Config.magmaCreamEssence+1];
        recipe[0] = magma_cream;
        for (int i = 1; i <= Config.magmaCreamEssence; i++) {
            recipe[i] = essence;
        }
        return recipe;
    }
}

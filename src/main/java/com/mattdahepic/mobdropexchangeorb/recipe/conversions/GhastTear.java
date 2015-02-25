package com.mattdahepic.mobdropexchangeorb.recipe.conversions;

import com.mattdahepic.mobdropexchangeorb.MobDropExchangeOrb;
import com.mattdahepic.mobdropexchangeorb.config.Config;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class GhastTear {
    public GhastTear () {}
    public static void registerRecipes () {
        GameRegistry.addShapelessRecipe(new ItemStack(MobDropExchangeOrb.itemMobEssence, Config.ghastTearEssence),convert()); //turn into essence
        GameRegistry.addShapelessRecipe(new ItemStack(Items.ghast_tear,2),produce());
    }
    private static Object[] convert () {
        ItemStack orb = new ItemStack(MobDropExchangeOrb.itemMobDropExchangeOrb.setContainerItem(MobDropExchangeOrb.itemMobDropExchangeOrb));
        ItemStack ghast_tear = new ItemStack(Items.ghast_tear);
        Object[] recipe = new Object[2];
        recipe[0] = orb;
        recipe[1] = ghast_tear;
        return recipe;
    }
    private static Object[] produce () {
        ItemStack ghast_tear = new ItemStack(Items.ghast_tear);
        ItemStack essence = new ItemStack(MobDropExchangeOrb.itemMobEssence);
        Object[] recipe = new Object[Config.ghastTearEssence+1];
        recipe[0] = ghast_tear;
        for (int i = 1; i <= Config.ghastTearEssence; i++) {
            recipe[i] = essence;
        }
        return recipe;
    }
}

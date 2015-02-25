package com.mattdahepic.mobdropexchangeorb.recipe.conversions;

import com.mattdahepic.mobdropexchangeorb.MobDropExchangeOrb;
import com.mattdahepic.mobdropexchangeorb.config.Config;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class EnderPearl {
    public EnderPearl () {}
    public static void registerRecipes () {
        GameRegistry.addShapelessRecipe(new ItemStack(MobDropExchangeOrb.itemMobEssence, Config.enderPealEssence),convert()); // turn into essence
        GameRegistry.addShapelessRecipe(new ItemStack(Items.ender_pearl,2),produce());
    }
    private static Object[] convert () {
        ItemStack orb = new ItemStack(MobDropExchangeOrb.itemMobDropExchangeOrb.setContainerItem(MobDropExchangeOrb.itemMobDropExchangeOrb),1,32767);
        ItemStack ender_pearl = new ItemStack(Items.ender_pearl);
        Object[] recipe = new Object[2];
        recipe[0] = orb;
        recipe[1] = ender_pearl;
        return recipe;
    }
    private static Object[] produce () {
        ItemStack ender_pearl = new ItemStack(Items.ender_pearl);
        ItemStack essence = new ItemStack(MobDropExchangeOrb.itemMobEssence);
        Object[] recipe = new Object[Config.enderPealEssence+1];
        recipe[0] = ender_pearl;
        for (int i = 1; i <= Config.enderPealEssence; i++) {
            recipe[i] = essence;
        }
        return  recipe;
    }
}

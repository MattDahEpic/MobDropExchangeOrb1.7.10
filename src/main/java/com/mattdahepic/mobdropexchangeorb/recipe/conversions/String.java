package com.mattdahepic.mobdropexchangeorb.recipe.conversions;

import com.mattdahepic.mobdropexchangeorb.MobDropExchangeOrb;
import com.mattdahepic.mobdropexchangeorb.config.Config;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class String {
    public String () {}
    public static void registerRecipes() {
        GameRegistry.addShapelessRecipe(new ItemStack(MobDropExchangeOrb.itemMobEssence, Config.stringEssence),convert()); //turn into essence
        GameRegistry.addShapelessRecipe(new ItemStack(Items.string,2),produce());
    }
    public static Object[] convert() {
        ItemStack orb = new ItemStack(MobDropExchangeOrb.itemMobDropExchangeOrb.setContainerItem(MobDropExchangeOrb.itemMobDropExchangeOrb),1,32767);
        ItemStack string = new ItemStack(Items.string);
        Object[] recipe = new Object[2];
        recipe[0] = orb;
        recipe[1] = string;
        return recipe;
    }
    public static Object[] produce() {
        ItemStack string = new ItemStack(Items.string);
        ItemStack essence = new ItemStack(MobDropExchangeOrb.itemMobEssence);
        Object[] recipe = new Object[Config.stringEssence+1];
        recipe[0] = string;
        for (int i = 1; i <= Config.stringEssence; i++) {
            recipe[i] = essence;
        }
        return recipe;
    }
}

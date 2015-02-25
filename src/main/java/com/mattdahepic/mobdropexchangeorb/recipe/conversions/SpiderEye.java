package com.mattdahepic.mobdropexchangeorb.recipe.conversions;

import com.mattdahepic.mobdropexchangeorb.MobDropExchangeOrb;
import com.mattdahepic.mobdropexchangeorb.config.Config;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class SpiderEye {
    public SpiderEye () {}
    public static void registerRecipes() {
        GameRegistry.addShapelessRecipe(new ItemStack(MobDropExchangeOrb.itemMobEssence, Config.spiderEyeEssence),convert()); //turn into essence
        GameRegistry.addShapelessRecipe(new ItemStack(Items.spider_eye,2),produce());
    }
    private static Object[] convert() {
        ItemStack orb = new ItemStack(MobDropExchangeOrb.itemMobDropExchangeOrb.setContainerItem(MobDropExchangeOrb.itemMobDropExchangeOrb),1,32767);
        ItemStack spider_eye = new ItemStack(Items.spider_eye);
        Object[] recipe = new Object[2];
        recipe[0] = orb;
        recipe[1] = spider_eye;
        return recipe;
    }
    private static Object[] produce() {
        ItemStack spider_eye = new ItemStack(Items.spider_eye);
        ItemStack essence = new ItemStack(MobDropExchangeOrb.itemMobEssence);
        Object[] recipe = new Object[Config.spiderEyeEssence+1];
        recipe[0] = spider_eye;
        for (int i = 1; i <= Config.spiderEyeEssence; i++) {
            recipe[i] = essence;
        }
        return recipe;
    }
}

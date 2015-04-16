package com.mattdahepic.mobdropexchangeorb.recipe;

import com.mattdahepic.mdecore.helpers.LogHelper;
import com.mattdahepic.mobdropexchangeorb.MobDropExchangeOrb;
import com.mattdahepic.mobdropexchangeorb.config.Config;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class RecipeRegisterer {
    public static void registerRecipes (boolean musicDisks,boolean witchDrops, boolean orbHardMode) {
        ShapelessRecipeConversionHandler.registerRecipes(new ItemStack(Items.blaze_rod), Config.blazeEssence);
        ShapelessRecipeConversionHandler.registerRecipes(new ItemStack(Items.string),Config.stringEssence);
        ShapelessRecipeConversionHandler.registerRecipes(new ItemStack(Items.spider_eye),Config.spiderEyeEssence);
        ShapelessRecipeConversionHandler.registerRecipes(new ItemStack(Items.gunpowder),Config.gunpowderEssence);
        ShapelessRecipeConversionHandler.registerRecipes(new ItemStack(Items.ender_pearl),Config.enderPealEssence);
        ShapelessRecipeConversionHandler.registerRecipes(new ItemStack(Items.ghast_tear),Config.ghastTearEssence);
        ShapelessRecipeConversionHandler.registerRecipes(new ItemStack(Items.magma_cream),Config.magmaCreamEssence);
        ShapelessRecipeConversionHandler.registerRecipes(new ItemStack(Items.arrow),Config.arrowEssence);
        ShapelessRecipeConversionHandler.registerRecipes(new ItemStack(Items.bone),Config.boneEssence);
        ShapelessRecipeConversionHandler.registerRecipes(new ItemStack(Items.slime_ball),Config.slimeBallEssence);
        ShapelessRecipeConversionHandler.registerRecipes(new ItemStack(Items.rotten_flesh),Config.rottenFleshEssence);
        if (musicDisks) {
            MusicDiskConversionRecipeHandler.registerRecipes();
        } else {
            MusicDiskConversionRecipeHandler.removeRecipes();
            LogHelper.info(MobDropExchangeOrb.MODID,"Music Disk Conversion not enabled!");
        }
        if (witchDrops) {
            ShapelessRecipeConversionHandler.registerRecipes(new ItemStack(Items.glass_bottle),Config.glassBottleEssence);
            ShapelessRecipeConversionHandler.registerRecipes(new ItemStack(Items.glowstone_dust),Config.glowstoneEssence);
            ShapelessRecipeConversionHandler.registerRecipes(new ItemStack(Items.redstone),Config.redstoneEssence);
            ShapelessRecipeConversionHandler.registerRecipes(new ItemStack(Items.stick),Config.stickEssence);
            ShapelessRecipeConversionHandler.registerRecipes(new ItemStack(Items.sugar),Config.sugarEssence);
        } else {
            ShapelessRecipeConversionHandler.removeRecipes(new ItemStack(Items.glass_bottle),Config.glassBottleEssence);
            ShapelessRecipeConversionHandler.removeRecipes(new ItemStack(Items.glowstone_dust),Config.glowstoneEssence);
            ShapelessRecipeConversionHandler.removeRecipes(new ItemStack(Items.redstone),Config.redstoneEssence);
            ShapelessRecipeConversionHandler.removeRecipes(new ItemStack(Items.stick),Config.stickEssence);
            ShapelessRecipeConversionHandler.removeRecipes(new ItemStack(Items.sugar),Config.sugarEssence);
            LogHelper.info(MobDropExchangeOrb.MODID,"Witch Drop Conversion not enabled!");
        }
        OrbRecipeHandler.removeRecipes();
        if (orbHardMode) {
            OrbRecipeHandler.registerRecipes(true);
            LogHelper.info(MobDropExchangeOrb.MODID,"Mob Drop Exchange Orb hard recipe enabled!");
        } else {
            OrbRecipeHandler.registerRecipes(false);
            LogHelper.info(MobDropExchangeOrb.MODID,"Mob Drop Exchange Orb normal recipe enabled!");
        }
    }
}

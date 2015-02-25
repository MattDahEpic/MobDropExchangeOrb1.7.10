package com.mattdahepic.mobdropexchangeorb.recipe.conversions;

import com.mattdahepic.mobdropexchangeorb.MobDropExchangeOrb;
import com.mattdahepic.mobdropexchangeorb.config.Config;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import org.apache.logging.log4j.Level;

public class MusicDisk {
    static ItemStack orb = new ItemStack(MobDropExchangeOrb.itemMobDropExchangeOrb.setContainerItem(MobDropExchangeOrb.itemMobDropExchangeOrb),1,32767);
    public MusicDisk () {}
    public static void registerRecipes () {
        if (Config.convertMusicDisks == true) { //if allowed to convert music disks
            //System.out.println("[MobDropExchangeOrb] LOG: Backup log message: Making recipes for music disks.");
            FMLLog.log(MobDropExchangeOrb.MODID,Level.INFO,"Music Disk conversion enabled! Registering Recipes.",null);
            GameRegistry.addShapelessRecipe(new ItemStack(Items.record_cat),recipe1());
            GameRegistry.addShapelessRecipe(new ItemStack(Items.record_blocks),recipe2());
            GameRegistry.addShapelessRecipe(new ItemStack(Items.record_chirp),recipe3());
            GameRegistry.addShapelessRecipe(new ItemStack(Items.record_far),recipe4());
            GameRegistry.addShapelessRecipe(new ItemStack(Items.record_mall),recipe5());
            GameRegistry.addShapelessRecipe(new ItemStack(Items.record_mellohi),recipe6());
            GameRegistry.addShapelessRecipe(new ItemStack(Items.record_stal),recipe7());
            GameRegistry.addShapelessRecipe(new ItemStack(Items.record_strad),recipe8());
            GameRegistry.addShapelessRecipe(new ItemStack(Items.record_ward),recipe9());
            GameRegistry.addShapelessRecipe(new ItemStack(Items.record_11),recipe10());
            GameRegistry.addShapelessRecipe(new ItemStack(Items.record_wait),recipe11());
            GameRegistry.addShapelessRecipe(new ItemStack(Items.record_13),recipe12());
        } else {
            //System.out.println("[MobDropExchangeOrb] WARN: Backup warning message: Not making recipes for music disks.");
            FMLLog.log(MobDropExchangeOrb.MODID, Level.WARN, "Music Disk conversion disabled. Not registering recipes.",null);
        }
    }
    private static Object[] recipe1 () {
        Object[] recipe = new Object[2];
        recipe[0] = orb;
        recipe[1] = new ItemStack(Items.record_13);
        return recipe;
    }
    private static Object[] recipe2 () {
        Object[] recipe = new Object[2];
        recipe[0] = orb;
        recipe[1] = new ItemStack(Items.record_cat);
        return recipe;
    }
    private static Object[] recipe3 () {
        Object[] recipe = new Object[2];
        recipe[0] = orb;
        recipe[1] = new ItemStack(Items.record_blocks);
        return recipe;
    }
    private static Object[] recipe4 () {
        Object[] recipe = new Object[2];
        recipe[0] = orb;
        recipe[1] = new ItemStack(Items.record_chirp);
        return recipe;
    }
    private static Object[] recipe5 () {
        Object[] recipe = new Object[2];
        recipe[0] = orb;
        recipe[1] = new ItemStack(Items.record_far);
        return recipe;
    }
    private static Object[] recipe6 () {
        Object[] recipe = new Object[2];
        recipe[0] = orb;
        recipe[1] = new ItemStack(Items.record_mall);
        return recipe;
    }
    private static Object[] recipe7 () {
        Object[] recipe = new Object[2];
        recipe[0] = orb;
        recipe[1] = new ItemStack(Items.record_mellohi);
        return recipe;
    }
    private static Object[] recipe8 () {
        Object[] recipe = new Object[2];
        recipe[0] = orb;
        recipe[1] = new ItemStack(Items.record_stal);
        return recipe;
    }
    private static Object[] recipe9 () {
        Object[] recipe = new Object[2];
        recipe[0] = orb;
        recipe[1] = new ItemStack(Items.record_strad);
        return recipe;
    }
    private static Object[] recipe10 () {
        Object[] recipe = new Object[2];
        recipe[0] = orb;
        recipe[1] = new ItemStack(Items.record_ward);
        return recipe;
    }
    private static Object[] recipe11 () {
        Object[] recipe = new Object[2];
        recipe[0] = orb;
        recipe[1] = new ItemStack(Items.record_11);
        return recipe;
    }
    private static Object[] recipe12 () {
        Object[] recipe = new Object[2];
        recipe[0] = orb;
        recipe[1] = new ItemStack(Items.record_wait);
        return recipe;
    }
}

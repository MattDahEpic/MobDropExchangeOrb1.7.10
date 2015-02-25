package com.mattdahepic.mobdropexchangeorb.config;

import com.mattdahepic.mobdropexchangeorb.MobDropExchangeOrb;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;
import org.apache.logging.log4j.Level;

public class Config {
    public static int blazeEssence = 2;
    public static int stringEssence = 1;
    public static int spiderEyeEssence = 2;
    public static int gunpowderEssence = 1;
    public static boolean convertMusicDisks = true;
    public static int enderPealEssence = 4;
    public static int ghastTearEssence = 3;
    public static int magmaCreamEssence = 2;
    public static int arrowEssence = 1;
    public static int boneEssence = 1;
    public static int slimeBallEssence = 1;
    public static int rottenFleshEssence = 1;

    public static boolean convertWitchDrops = true;
    public static int glassBottleEssence = 1;
    public static int glowstoneEssence = 2;
    public static int redstoneEssence = 1;
    public static int stickEssence = 1;
    public static int sugarEssence = 1;

    public Config () {}

    public static void load (FMLPreInitializationEvent event) {
        MobDropExchangeOrb.configFile = new Configuration(event.getSuggestedConfigurationFile());
        syncConfig();
    }
    public static void syncConfig () {
        try {
            Config.processConfig(MobDropExchangeOrb.configFile);
        } catch (Exception e) {
            FMLLog.log(MobDropExchangeOrb.MODID,Level.ERROR,"Error processing config file!");
        } finally {
            if (MobDropExchangeOrb.configFile.hasChanged()) {
                FMLLog.log(MobDropExchangeOrb.MODID,Level.DEBUG,"Saving config file!");
                MobDropExchangeOrb.configFile.save();
            }
        }
    }
    @SubscribeEvent
    public void onConfigChanged (ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.modID.equals(MobDropExchangeOrb.MODID)) {
            FMLLog.log(MobDropExchangeOrb.MODID,Level.INFO,"Updating config...");
            syncConfig();
        }
    }
    public static void processConfig (Configuration config) {
        blazeEssence = config.getInt("blazeEssence",Configuration.CATEGORY_GENERAL,blazeEssence,1,8,"Amount of mob essence a blaze rod is worth.");
        stringEssence = config.getInt("stringEssence",Configuration.CATEGORY_GENERAL,stringEssence,1,8,"Amount of mob essence a string is worth.");
        spiderEyeEssence = config.getInt("spiderEyeEssence",Configuration.CATEGORY_GENERAL,spiderEyeEssence,1,8,"Amount of mob essence a spider eye is worth");
        gunpowderEssence = config.getInt("gunpowderEssence",Configuration.CATEGORY_GENERAL,gunpowderEssence,1,8,"Amount of mob essence a gunpowder is worth.");
        convertMusicDisks = config.getBoolean("convertMusicDisks",Configuration.CATEGORY_GENERAL,convertMusicDisks,"Convert music disks with exchange orb?");
        enderPealEssence = config.getInt("enderPearlEssence",Configuration.CATEGORY_GENERAL,enderPealEssence,1,8,"Amount of mob essence an ender pearl is worth.");
        ghastTearEssence = config.getInt("ghastTearEssence",Configuration.CATEGORY_GENERAL,ghastTearEssence,1,8,"Amount of mob essence a ghast tear is worth.");
        magmaCreamEssence = config.getInt("magmaCreamEssence",Configuration.CATEGORY_GENERAL,magmaCreamEssence,1,8,"Amount of mob essence a magma cream is worth.");
        arrowEssence = config.getInt("arrowEssence",Configuration.CATEGORY_GENERAL,arrowEssence,1,8,"Amount of mob essence an arrow is worth.");
        boneEssence = config.getInt("boneEssence",Configuration.CATEGORY_GENERAL,boneEssence,1,8,"Amount of mob essence a bone is worth.");
        slimeBallEssence = config.getInt("slimeBallEssence",Configuration.CATEGORY_GENERAL,slimeBallEssence,1,8,"Amount of mob essence a slime ball is worth.");
        rottenFleshEssence = config.getInt("rottenFleshEssence",Configuration.CATEGORY_GENERAL,rottenFleshEssence,1,8,"Amount of mob essence a rotten flesh is worth.");
        convertWitchDrops = config.getBoolean("convertWitchDrops",Configuration.CATEGORY_GENERAL,convertWitchDrops,"Convert witch drops?");
        glassBottleEssence = config.getInt("glassBottleEssence",Configuration.CATEGORY_GENERAL,glassBottleEssence,1,8,"Amount of mob essence a glass bottle is worth.");
        glowstoneEssence = config.getInt("glowstoneEssence",Configuration.CATEGORY_GENERAL,glowstoneEssence,1,8,"Amount of mob essence a glowstone is worth.");
        redstoneEssence = config.getInt("redstoneEssence",Configuration.CATEGORY_GENERAL,redstoneEssence,1,8,"Amount of mob essence a redstone is worth.");
        stickEssence = config.getInt("stickEssence",Configuration.CATEGORY_GENERAL,stickEssence,1,8,"Amount of mob essence a stick is worth.");
        sugarEssence = config.getInt("sugarEssence",Configuration.CATEGORY_GENERAL,sugarEssence,1,8,"Amount of mob essence a sugar is worth.");
    }
}
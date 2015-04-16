package com.mattdahepic.mobdropexchangeorb.config;

import com.mattdahepic.mobdropexchangeorb.MobDropExchangeOrb;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;
import org.apache.logging.log4j.Level;

public class Config {
    public static final int MIN = 1;
    public static final int MAX = 8;

    public static final String CATEGORY_ESSENCE = "essence";
    public static int blazeEssence = 2;
    public static int stringEssence = 1;
    public static int spiderEyeEssence = 2;
    public static int gunpowderEssence = 1;
    public static int enderPealEssence = 4;
    public static int ghastTearEssence = 3;
    public static int magmaCreamEssence = 2;
    public static int arrowEssence = 1;
    public static int boneEssence = 1;
    public static int slimeBallEssence = 1;
    public static int rottenFleshEssence = 1;

    public static boolean convertMusicDisks = true;

    public static final String CATEGORY_WITCH = "witch";
    public static boolean convertWitchDrops = true;
    public static int glassBottleEssence = 1;
    public static int glowstoneEssence = 2;
    public static int redstoneEssence = 1;
    public static int stickEssence = 1;
    public static int sugarEssence = 1;

    public static final String CATEGORY_ORB = "orb";
    public static boolean orbHasDurability = false;
    public static int orbDurability = 200;
    public static boolean orbHardMode = false;

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
    public static void processConfig (Configuration c) {
        blazeEssence = c.getInt("blazeEssence",CATEGORY_ESSENCE,blazeEssence,MIN,MAX,"Worth of a blaze rod in essence.");
        stringEssence = c.getInt("stringEssence",CATEGORY_ESSENCE,stringEssence,MIN,MAX,"Worth of a string in essence.");
        spiderEyeEssence = c.getInt("spiderEyeEssence",CATEGORY_ESSENCE,spiderEyeEssence,MIN,MAX,"Worth of a spider eye in essence.");
        gunpowderEssence = c.getInt("gunpowderEssence",CATEGORY_ESSENCE,gunpowderEssence,MIN,MAX,"Worth of a gunpowder in essence");
        enderPealEssence = c.getInt("enderPearlEssence",CATEGORY_ESSENCE,enderPealEssence,MIN,MAX,"Worth of an ender pearl in essence.");
        ghastTearEssence = c.getInt("ghastTearEssence",CATEGORY_ESSENCE,ghastTearEssence,MIN,MAX,"Worth of ghast tear in essence.");
        magmaCreamEssence = c.getInt("magmaCreamEssence",CATEGORY_ESSENCE,magmaCreamEssence,MIN,MAX,"Worth of a magma cream in essence.");
        arrowEssence = c.getInt("arrowEssence",CATEGORY_ESSENCE,arrowEssence,MIN,MAX,"Worth of an arrow in essence.");
        boneEssence = c.getInt("boneEssence",CATEGORY_ESSENCE,boneEssence,MIN,MAX,"Worth of a bone in essence.");
        slimeBallEssence = c.getInt("slimeBallEssence",CATEGORY_ESSENCE,slimeBallEssence,MIN,MAX,"Worth of a slime ball in essence.");
        rottenFleshEssence = c.getInt("rottenFleshEssence",CATEGORY_ESSENCE,rottenFleshEssence,MIN,MAX,"Worth of a rotten flesh in essence.");

        convertMusicDisks = c.getBoolean("convertMusicDisks",CATEGORY_ESSENCE,convertMusicDisks,"Should music disks be converted between the types?");

        convertWitchDrops = c.getBoolean("convertWitchDrops",CATEGORY_WITCH,convertWitchDrops,"Should witch drops be convertable?");
        glassBottleEssence = c.getInt("glassBottleEssence",CATEGORY_WITCH,glassBottleEssence,MIN,MAX,"Worth of a glass bottle in essence.");
        glowstoneEssence = c.getInt("glowstoneEssence",CATEGORY_WITCH,glowstoneEssence,MIN,MAX,"Worth of a glowstone dust in essence.");
        redstoneEssence = c.getInt("redstoneEssence",CATEGORY_WITCH,redstoneEssence,MIN,MAX,"Worth of a redstone in essence");
        stickEssence = c.getInt("stickEssence",CATEGORY_WITCH,stickEssence,MIN,MAX,"Worth of a measly stick in essence.");
        sugarEssence = c.getInt("sugarEssence",CATEGORY_WITCH,sugarEssence,MIN,MAX,"Worth of a sugar in essence");

        orbHasDurability = c.getBoolean("orbHasDurability",CATEGORY_ORB,orbHasDurability,"Does the Mob Drop Exchange Orb have a limited amount of uses?");
        orbDurability = c.getInt("orbDurability",CATEGORY_ORB,orbDurability,1,999,"Amount of uses the orb has, if enabled.");
        orbHardMode = c.getBoolean("orbHardMode",CATEGORY_ORB,orbHardMode,"Should the orb require a nether star instead of stone to craft?");
    }
}
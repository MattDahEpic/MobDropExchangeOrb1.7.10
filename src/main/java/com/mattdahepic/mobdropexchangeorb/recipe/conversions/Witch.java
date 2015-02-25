package com.mattdahepic.mobdropexchangeorb.recipe.conversions;

import com.mattdahepic.mobdropexchangeorb.MobDropExchangeOrb;
import com.mattdahepic.mobdropexchangeorb.config.Config;
import com.mattdahepic.mobdropexchangeorb.recipe.conversions.witchdrops.*;
import cpw.mods.fml.common.FMLLog;
import org.apache.logging.log4j.Level;

public class Witch {
    public Witch () {}
    public static void registerRecipes() {
        if (Config.convertWitchDrops) {
            FMLLog.log(MobDropExchangeOrb.MODID,Level.INFO,"Witch drop conversion enabled! Registering recipes!",null);
            GlassBottle.registerRecipes();
            Glowstone.registerRecipes();
            Redstone.registerRecipes();
            Stick.registerRecipes();
            Sugar.registerRecipes();
        } else {
            //witch drops not being registered!
            FMLLog.log(MobDropExchangeOrb.MODID,Level.WARN,"Witch drop conversion disabled. Not registering recipes.",null);
        }
    }
}

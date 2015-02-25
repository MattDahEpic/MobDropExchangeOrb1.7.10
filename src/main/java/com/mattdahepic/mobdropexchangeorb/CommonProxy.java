package com.mattdahepic.mobdropexchangeorb;

import com.mattdahepic.mobdropexchangeorb.recipe.RecipeMobDropExchangeOrb;
import com.mattdahepic.mobdropexchangeorb.recipe.conversions.*;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy {
    public void registerRenderers() {}
    public void registerBlocksItems() {
        GameRegistry.registerItem(MobDropExchangeOrb.itemMobDropExchangeOrb,"mobDropExchangeOrb");
        GameRegistry.registerItem(MobDropExchangeOrb.itemMobEssence,"mobEssence");
    }
    public void registerRecipes() {
        RecipeMobDropExchangeOrb.registerRecipes();
        //conversions
        BlazeRod.registerRecipes();
        com.mattdahepic.mobdropexchangeorb.recipe.conversions.String.registerRecipes();
        SpiderEye.registerRecipes();
        Gunpowder.registerRecipes();
        MusicDisk.registerRecipes();
        EnderPearl.registerRecipes();
        GhastTear.registerRecipes();
        MagmaCream.registerRecipes();
        Arrow.registerRecipes();
        RottenFlesh.registerRecipes();
        Bone.registerRecipes();
        SlimeBall.registerRecipes();
        Witch.registerRecipes();
    }
}

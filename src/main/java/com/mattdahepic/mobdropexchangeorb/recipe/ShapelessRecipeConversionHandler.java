package com.mattdahepic.mobdropexchangeorb.recipe;

import com.mattdahepic.mdecore.helpers.LogHelper;
import com.mattdahepic.mobdropexchangeorb.MobDropExchangeOrb;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraftforge.oredict.OreDictionary;

import java.util.ArrayList;
import java.util.List;

public class ShapelessRecipeConversionHandler {
    public static void registerRecipes (ItemStack mobDrop,int dropWorth) {
        GameRegistry.addRecipe(decompose(mobDrop, dropWorth));
        GameRegistry.addRecipe(create(mobDrop, dropWorth));
    }
    public static void removeRecipes (ItemStack mobDrop,int dropWorth) {
        try {
            CraftingManager.getInstance().getRecipeList().remove(decompose(mobDrop, dropWorth));
            CraftingManager.getInstance().getRecipeList().remove(create(mobDrop, dropWorth));
        } catch (Exception e) {
            LogHelper.error(MobDropExchangeOrb.MODID,"OH FUCK! Eerything is dying! Trying to remove thing that doesn't exist!");
            LogHelper.trace(MobDropExchangeOrb.MODID,e);
        }
    }
    private static IRecipe decompose (ItemStack mobDrop, int dropWorth) {
        ItemStack output = new ItemStack(MobDropExchangeOrb.itemMobEssence,dropWorth);
        List<ItemStack> input = new ArrayList<ItemStack>();
        input.add(new ItemStack(MobDropExchangeOrb.itemMobDropExchangeOrb,1, OreDictionary.WILDCARD_VALUE));
        input.add(mobDrop);
        return new ShapelessRecipes(output,input);
    }
    private static IRecipe create (ItemStack mobDrop,int dropWorth) {
        ItemStack output = new ItemStack(mobDrop.getItem(),2);
        List<ItemStack> input = new ArrayList<ItemStack>();
        input.add(mobDrop);
        ItemStack essence = new ItemStack(MobDropExchangeOrb.itemMobEssence,1);
        for (int i = 0; i < dropWorth; i++) {
            input.add(essence);
        }
        return new ShapelessRecipes(output,input);
    }
}

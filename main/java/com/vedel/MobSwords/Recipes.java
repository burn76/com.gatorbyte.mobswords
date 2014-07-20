package com.vedel.MobSwords;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {
	public static void load() {
		GameRegistry.addShapedRecipe(new ItemStack(com.vedel.MobSwords.Items.CowSword), new Object[] {"MIM", "MIM", "MSM", 'M', Items.cooked_beef, 'I', Items.iron_ingot, 'S', Items.stick});
		
		GameRegistry.addShapedRecipe(new ItemStack(com.vedel.MobSwords.Items.PigSword), new Object[] {"PIP", "PIP", "PSP", 'P', Items.cooked_porkchop, 'I', Items.iron_ingot, 'S', Items.stick});
	}
}

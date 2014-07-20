package com.vedel.MobSwords;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {
	public static void load() {

		//Pig Spawn Egg Recipe
		GameRegistry.addShapedRecipe(new ItemStack(Items.spawn_egg, 1, 90), new Object[] {"PGP", "GEG", "PGP", 'P', Items.porkchop, 'G', Items.gold_ingot, 'E', Items.emerald});
		//Sheep Spawn Egg Recipe
		GameRegistry.addShapedRecipe(new ItemStack(Items.spawn_egg, 1, 91), new Object[] {"WGW", "GEG", "WGW", 'W', Blocks.wool, 'G', Items.gold_ingot, 'E', Items.emerald});
		//Cow Spawn Egg Recipe
		GameRegistry.addShapedRecipe(new ItemStack(Items.spawn_egg, 1, 92), new Object[] {"BGB", "GEG", "BGB", 'B', Items.beef, 'G', Items.gold_ingot, 'E', Items.emerald});
		
		//Pig Sword Recipe
		GameRegistry.addRecipe(new ItemStack(com.vedel.MobSwords.Items.PigSword), new Object[] {" E ", " E ", " S ", 'E', new ItemStack(Items.spawn_egg, 1, 90), 'S', Items.stick});
		//Sheep Sword Recipe
		GameRegistry.addRecipe(new ItemStack(com.vedel.MobSwords.Items.SheepSword), new Object[] {"E", "E", "S", 'E', new ItemStack(Items.spawn_egg, 1, 91), 'S', Items.stick});
		//Cow Sword Recipe
		GameRegistry.addRecipe(new ItemStack(com.vedel.MobSwords.Items.CowSword), new Object[] {"E", "E", "S", 'E', new ItemStack(Items.spawn_egg, 1, 92), 'S', Items.stick});
	}
}

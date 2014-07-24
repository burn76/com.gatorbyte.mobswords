package com.gatorbyte.MobSwords;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {
	
	private static String[][] recipePatterns = new String[][] {{"#G#", "GEG", "#G#"}, {"E", "E", "S"}};
	private static Object[][] recipeItems = new Object[][]  {{Items.porkchop, 
															  Blocks.wool, 
															  Items.beef, 
															  Items.feather,
															  new ItemStack(Items.dye, 1, 0)}, 
															 {com.gatorbyte.MobSwords.Items.PigSword, 
															  com.gatorbyte.MobSwords.Items.SheepSword, 
															  com.gatorbyte.MobSwords.Items.CowSword, 
															  com.gatorbyte.MobSwords.Items.ChickenSword,
															  com.gatorbyte.MobSwords.Items.SquidSword}};
	private static int[] spawnEggTypes = new int[] {90, 91, 92, 93, 94};
	
	public static void load() {
		for (int j = 0; j < recipeItems[0].length; j++) {
			//Add spawn egg recipes
			GameRegistry.addShapedRecipe(new ItemStack(Items.spawn_egg, 1, spawnEggTypes[j]), 
										 new Object[] {recipePatterns[0], '#', recipeItems[0][j], 'G', Items.gold_ingot, 'E', Items.emerald});
			//Add mob swords
			GameRegistry.addRecipe(new ItemStack((Item)recipeItems[1][j]), 
								   new Object[] {recipePatterns[1], 'E', new ItemStack(Items.spawn_egg, 1, spawnEggTypes[j]), 'S', Items.stick});
		}	
	}
}

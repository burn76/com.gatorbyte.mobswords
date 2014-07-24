package com.gatorbyte.MobSwords.Item;

import com.gatorbyte.MobSwords.MobSwords;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class ItemSheepSword extends ItemSword {

	public ItemSheepSword()
	{
		super(Item.ToolMaterial.IRON);
		this.setUnlocalizedName("SheepSword");
		this.setTextureName(MobSwords.modid + ":" + "SheepSword");
	}
}

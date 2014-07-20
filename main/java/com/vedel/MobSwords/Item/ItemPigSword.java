package com.vedel.MobSwords.Item;

import com.vedel.MobSwords.MobSwords;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class ItemPigSword extends ItemSword {

	public ItemPigSword()
	{
		super(Item.ToolMaterial.IRON);
		this.setUnlocalizedName("PigSword");
		this.setTextureName(MobSwords.modid + ":" + "PigSword");
	}
}

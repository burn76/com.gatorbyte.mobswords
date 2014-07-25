package com.gatorbyte.mobswords.Item;

import com.gatorbyte.mobswords.MobSwords;
import com.gatorbyte.mobswords.reference.Reference;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class ItemCowSword extends ItemSword {

	public ItemCowSword(ToolMaterial material)
	{
		super(material);
	}
	
	@Override
    public Item setTextureName(String name)
    {
        this.iconString = Reference.MOD_ID + ":" + name;
        return this;
    }
}

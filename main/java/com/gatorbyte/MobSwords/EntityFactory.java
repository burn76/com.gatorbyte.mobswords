package com.gatorbyte.MobSwords;

import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityFactory {
	public static Entity getEntity(Item mobSword, World world)
	{
		Entity entity = null;
		if(mobSword != null)
		{			
			if(mobSword == Items.CowSword)
				entity = new EntityCow(world);
			else if(mobSword == Items.PigSword)
				entity = new EntityPig(world);
			else if(mobSword == Items.SheepSword)
				entity = new EntitySheep(world);
			else if(mobSword == Items.ChickenSword)
				entity = new EntityChicken(world);
			else if(mobSword == Items.SquidSword)
				entity = new EntitySquid(world);
		}
		return entity;
	}
}

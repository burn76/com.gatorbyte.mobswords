package com.vedel.MobSwords;

import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class EventHook
{

	@SubscribeEvent
	public void entityAttacked(AttackEntityEvent event)
	{
		
		EntityPlayer player = event.entityPlayer;
		World world = player.worldObj;
		if(world.isRemote)
		{
			return;
		}
		ItemStack itemStack = player.getCurrentEquippedItem();
		Item item = itemStack.getItem();
		if(item != null && item == Items.CowSword)
		{
			EntityCow cow = new EntityCow(world);
			cow.setLocationAndAngles(event.entity.posX, event.entity.posY + 1, event.entity.posZ, MathHelper.wrapAngleTo180_float(world.rand.nextFloat() * 360.0F), 0.0F);
			world.spawnEntityInWorld(cow);
		}
				
		if(item != null && item == Items.PigSword)
		{
			EntityPig pig = new EntityPig(world);
			pig.setLocationAndAngles(event.entity.posX, event.entity.posY + 1, event.entity.posZ, MathHelper.wrapAngleTo180_float(world.rand.nextFloat() * 360.0F), 0.0F);
			world.spawnEntityInWorld(pig);
		}
	}
}
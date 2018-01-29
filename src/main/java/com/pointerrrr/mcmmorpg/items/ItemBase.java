package com.pointerrrr.mcmmorpg.items;

import com.pointerrrr.mcmmorpg.Main;
import com.pointerrrr.mcmmorpg.init.ModItems;
import com.pointerrrr.mcmmorpg.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}

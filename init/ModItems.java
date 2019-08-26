package com.tegozy94.TheAstronomer.init;

import java.util.ArrayList;
import java.util.List;

import com.tegozy94.TheAstronomer.items.ItemBase;

import net.minecraft.item.Item;

public class ModItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>(); 
	
	public static final Item SKY_MAP = new ItemBase("sky_map");//cette ligne = 1 item 
	public static final Item THEASTRONOMERBOOK = new ItemBase("theastronomerbook");
	public static final Item POLAR_ALIGNMENT_SCOPE = new ItemBase("polar_alignment_scope");

}

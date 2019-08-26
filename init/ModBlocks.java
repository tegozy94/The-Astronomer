package com.tegozy94.TheAstronomer.init;

import java.util.ArrayList;
import java.util.List;

import com.tegozy94.TheAstronomer.blocks.BlockBase;
import com.tegozy94.TheAstronomer.blocks.Tripod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks
{
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block TRIPOD = new Tripod("tripod", Material.IRON);

}

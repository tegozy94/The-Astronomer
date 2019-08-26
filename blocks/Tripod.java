package com.tegozy94.TheAstronomer.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class Tripod extends BlockBase 
{

	public Tripod(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(3.0F);
		setResistance(10.0F);
		setHarvestLevel("pickaxe", 0);
		setLightOpacity(1);
	}

}

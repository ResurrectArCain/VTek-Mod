package esy.es.resurrect.blockz;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;

public class Blockreg {
	public static void blockreg()
	{
		initBlockReg();
		registerBlock();
	}
	
	public static Block TechBlock1;
	
	public static void initBlockReg(){
		TechBlock1 = new TechBlock1(Material.ground).setBlockName("TEXZBLOCKZ").setCreativeTab(CreativeTabs.tabMisc);
	}
	
	public static void registerBlock(){
		GameRegistry.registerBlock(TechBlock1, TechBlock1.getUnlocalizedName());
	}
}
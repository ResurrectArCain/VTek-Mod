package esy.es.resurrect.dire;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import esy.es.resurrect.dire.RefStrings;

@Mod(modid = RefStrings.MODID , name = RefStrings.NAME , version = RefStrings.VERSION)
public class MainRegistry {
	
	@SidedProxy(clientSide = RefStrings.CLIENTPROX, serverSide = RefStrings.SERVERPROX)
	public static ServerProxy proxy;
	
	@EventHandler
	public static void PreLoad(FMLPreInitializationEvent PreEvent){
		proxy.registerRenderInfo();
	}
	@EventHandler
	public static void load(FMLInitializationEvent event){
		
	}
	@EventHandler
	public static void PostLoad(FMLPostInitializationEvent PostEvent){
		
	}
	
}

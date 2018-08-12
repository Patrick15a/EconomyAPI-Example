package de.patrick15a.economyAPI.example;

import org.bukkit.plugin.java.JavaPlugin;

import de.patrick15a.economyAPI.EconomyAPI;

public class Main extends JavaPlugin {
	
	private static EconomyAPI economyAPI;
	private static Main instance;
	
	@Override
	public void onEnable() {
		
		instance = this;
		economyAPI = new EconomyAPI();
		
	}
	
	public static Main getInstance() {
		return instance;
	}
	
	public static EconomyAPI getEconomyAPI() {
		return economyAPI;
	}
	
}

package de.patrick15a.economyAPI.example;

import org.bukkit.entity.Player;

public class Economy {

	public void get(Player p) {
		Main.getEconomyAPI().getMoney(p);
	}
	
	public void add(Player p, int money) {
		Main.getEconomyAPI().addMoney(p, money);
	}
	
	public void remove(Player p, int money) {
		Main.getEconomyAPI().removeMoney(p, money);
	}
	
	public void set(Player p, int money) {
		Main.getEconomyAPI().setMoney(p, money);
	}
	
}

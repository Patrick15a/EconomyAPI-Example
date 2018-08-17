package de.patrick15a.economyAPI.example;

import org.bukkit.entity.Player;

public class Economy {
	
	// Gibt zurück wie viel Geld der Spieler hat.
	public int get(Player p) {
		return Main.getEconomyAPI().getMoney(p);
	}
	
	// Fügt dem Spieler Geld hinzu. Gibt zurück ob Funktion erfolgreich ausgeführt wurde.
	public boolean add(Player p, int money) {
		return Main.getEconomyAPI().addMoney(p, money);
	}
	
	// Entfernt dem Spieler Geld. Gibt zurück ob Funktion erfolgreich ausgeführt wurde.
	public boolean remove(Player p, int money) {
		return Main.getEconomyAPI().removeMoney(p, money);
	}
	
	// Setzt dem Spieler Geld. Gibt zurück ob Funktion erfolgreich ausgeführt wurde.
	public boolean set(Player p, int money) {
		return Main.getEconomyAPI().setMoney(p, money);
	}
	
	// Gibt zurück ob der Spieler "amount" Geld hat.
	public boolean has(Player p, int amount) {
		return Main.getEconomyAPI().hasMoney(p, amount);
	}
	
}

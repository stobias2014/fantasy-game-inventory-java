package com.tobias.saul;

import java.util.HashMap;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) {
		Map<String, Integer> inventory = new HashMap<>();
		inventory.put("rope", 1);
		inventory.put("torch", 6);
		inventory.put("gold coins", 42);
		inventory.put("dagger", 1);
		inventory.put("arrow", 12);
		
		Main.displayInventory(inventory);
		
	}
	
	public static void displayInventory(Map<String, Integer> inventory) {
		System.out.println("Inventory:\n");
		inventory.forEach((item, quantity) -> {
			System.out.println(quantity + " " + item);
		});
		int total = inventory.values().stream().mapToInt(Integer::valueOf).sum();
		System.out.println("\nTotal number of items: " + total);
	}

}

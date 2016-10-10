package com.book.guitarapp;

import java.util.ArrayList;
import java.util.List;

public class FindGuitarTester {
	
	public static void main(String args[]){
		
		// Setup Rick's guitar inventory
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		// What Customer wants
		GuitarSpec ErinSpecs = new GuitarSpec(EBuilder.GIBSON.toString(), "Stratocastor", EType.ACOUSTIC.toString(), EWood.BRAZILIAN_ROSEWOOD.toString(), EWood.INDIAN_ROSEWOOD.toString(), 12);
		Guitar whatErinLikes = new Guitar(null, 0, ErinSpecs);
		List<Guitar> guitar = new ArrayList<Guitar>();
		guitar = inventory.search(whatErinLikes);
		if(guitar != null){
			for (Guitar item : guitar) {
				System.out.println("Got it : Serial No is "+item.getSerialNumber()+" & price is: "+item.getPrice());
			}
		}else
			System.out.println("Not Found!");
		
		// List All Stock of Guitars
		List<Guitar> stockGuitar = inventory.getAllGuitar();
		System.out.println("Our Stock has: ");
		for (Guitar guitar2 : stockGuitar) {
			System.out.println(guitar2.getSerialNumber());
		}
		
		
	}
	
	
	// Private Definitions/Implementations
	
	private static void initializeInventory(Inventory inventory){
		
		inventory.addGuitar("V95693", 799.95, new GuitarSpec(EBuilder.FENDER.toString(), "Stratocastor", EType.ELECTRIC.toString(), "Alder", "Alder", 6));
		inventory.addGuitar("V95694", 1499.95, new GuitarSpec(EBuilder.MARTIN.toString(), "Stratocastor", "acoustic", "Alder", "Mahagony", 7));
		inventory.addGuitar("V95695", 499.95, new GuitarSpec(EBuilder.GIBSON.toString(), "Stratocastor", EType.ACOUSTIC.toString(), EWood.BRAZILIAN_ROSEWOOD.toString(), EWood.INDIAN_ROSEWOOD.toString(), 12));		
		
	}
}

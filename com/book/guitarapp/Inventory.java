package com.book.guitarapp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	
	private List<Guitar> guitars;
	
	// Constructor
	public Inventory() {
		guitars = new LinkedList<Guitar>();
	}
	
	// Add Guitar
	public void addGuitar(String serialNumber, double price, GuitarSpec guitarSpec){
		Guitar guitar = new Guitar(serialNumber, price, guitarSpec);
		guitars.add(guitar);
	}
	
	// Get Guitar
	public Guitar getGuitar(String serialNumber){
		
		for(Iterator<Guitar> i = guitars.iterator(); i.hasNext();){
			Guitar guitar = (Guitar) i.next();
			if(guitar.getSerialNumber().equalsIgnoreCase(serialNumber)){
				return guitar;
			}
		}
		return null;
	}
	
	// Search Guitar
	public List<Guitar> search(Guitar searchGuitar){
		
		List<Guitar> matchedGuitarList = new ArrayList<Guitar>();
		
		// Iterate through Guitar List
		for(Iterator<Guitar> i = guitars.iterator(); i.hasNext();){
			Guitar guitar = (Guitar) i.next();
			// Check if the Guitar Matches
			if(guitar.getGuitarSpec().matches(searchGuitar.getGuitarSpec()))		// Delegation :)
				matchedGuitarList.add(guitar);
		}
		return matchedGuitarList;
	}
	
	// Return Whole Stock of Guitar
	public List<Guitar> getAllGuitar(){
		return guitars;
	}
}





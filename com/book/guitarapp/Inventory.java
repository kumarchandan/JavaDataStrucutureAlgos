package com.book.guitarapp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	
	private List inventory;
	
	// Constructor
	public Inventory() {
		inventory = new LinkedList();
	}
	
	// Add Guitar
	public void addInstrument(String serialNumber, double price, InstrumentSpec spec){
		Instrument instrument = null;
		
		if(spec instanceof GuitarSpec) {
			instrument = new Guitar(serialNumber, price, (GuitarSpec) spec);
		} else if(spec instanceof MandolinSpec) {
			instrument = new Guitar(serialNumber, price, (MandolinSpec) spec);
		}
		
		inventory.add(instrument);
	}
	
	// Get Guitar
	public Instrument get(String serialNumber){
		
		for(Iterator<Guitar> i = inventory.iterator(); i.hasNext();){
			Instrument instrument = (Instrument) i.next();
			if(instrument.getSerialNumber().equalsIgnoreCase(serialNumber)){
				return instrument;
			}
		}
		return null;
	}
	
	// Search Guitar
	public List search(Guitar searchGuitar){
		
		List matchedGuitarList = new LinkedList();
		
		for(Iterator i = inventory.iterator(); i.hasNext();){
			Guitar guitar = (Guitar) i.next();
			if(guitar.getSpec().matches(searchGuitar.getSpec()))		// Delegation :)
				matchedGuitarList.add(guitar);
		}
		return matchedGuitarList;
	}
	
	// Search Mandolin
	public List search(Mandolin searchMandolin) {
		
		List matchedMandolin = new LinkedList();
		
		for (Iterator iterator = inventory.iterator(); iterator.hasNext();) {
			Mandolin mandolin = (Mandolin) iterator.next();
			if(mandolin.getSpec().matches(searchMandolin.getSpec())) {
				matchedMandolin.add(mandolin);
			}
			return matchedMandolin;
		}
		return matchedMandolin;
	}
	
	// Return Whole Stock of Guitar
	public List getAll(){
		return inventory;
	}
}





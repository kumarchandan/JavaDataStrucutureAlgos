package com.book.dogdoor;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {
	
	private boolean open;
	private List<Bark> allowedBarkList = new ArrayList<Bark>();

	// Constructor
	public DogDoor() {
		this.open = false;
	}
	
	// Check if Door is Open
	public boolean isOpen() {
		return open;
	}
	
	public List<Bark> getAllowedBarkList() {
		return allowedBarkList;
	}

	public void setAllowedBarkList(List<Bark> allowedBarkList) {
		this.allowedBarkList = allowedBarkList;
	}
	
	public void addAllowedBarkList(Bark bark){
		this.allowedBarkList.add(bark);
	}

	// Open the Door
	public void open(){
		System.out.println("Dog door opens.");
		this.open = true;
		
		// Close the Door automatically after 5 seconds
		final Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
				close();
				timer.cancel();
			}
		}, 5000);
	}
	
	// Close the Door
	public void close(){
		System.out.println("Dog door closes.");
		this.open = false;
	}
}

package com.book.dogdoor;

import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {
	
	private boolean open;
	private String allowedBark;
	
	public DogDoor(){
		this.open = false;
	}
	
	public String getAllowedBark() {
		return allowedBark;
	}

	public void setAllowedBark(String allowedBark) {
		this.allowedBark = allowedBark;
	}


	public void open(){
		System.out.println("Dog door opens.");
		this.open = true;
		
		final Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
				close();
				timer.cancel();
			}
		}, 5000);
	}
	
	public void close(){
		System.out.println("Dog door closes.");
		this.open = false;
	}
	
	public boolean isOpen(){
		return open;
	}
}

package com.book.java.arrays;

public class GameEntry {
	
	protected String name;
	protected int score;
	
	public GameEntry(String n, int s){
		this.name = n;
		this.score = s;
	}
	
	public String getName(){
		return name;
	}
	
	public int getScore(){
		return score;
	}
	
	public String toString(){
		return "("+name+","+getScore()+")";
	}
}

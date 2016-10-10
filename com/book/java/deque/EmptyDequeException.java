package com.book.java.deque;

public class EmptyDequeException extends RuntimeException {
	
	private static final long serialVersionUID = 976886827311510099L;
	
	public EmptyDequeException(String string) {
		super(string);
	}
}

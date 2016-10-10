package com.book.java.queue;

public class EmptyQueueException extends RuntimeException {

	private static final long serialVersionID = 1L;
	
	public EmptyQueueException(String str) {
		super(str);
	}
}

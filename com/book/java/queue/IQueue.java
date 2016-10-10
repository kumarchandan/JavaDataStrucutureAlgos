package com.book.java.queue;

public interface IQueue<E> {
	
	public void enqueue(E e);
	public E dequeue() throws EmptyQueueException;
	
	public int size();
	public boolean isEmpty();
	public E front() throws EmptyQueueException;
	
}

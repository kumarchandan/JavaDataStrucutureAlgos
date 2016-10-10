package com.book.java.deque;

public interface IDeque<E> {

	public boolean isEmpty();
	public int size() throws EmptyDequeException;
	
	public void addFirst(E e);
	public void addLast(E e);
	public E removeFirst() throws EmptyDequeException;
	public E removeLast() throws EmptyDequeException;
	
	public E getFirst() throws EmptyDequeException;
	public E getLast() throws EmptyDequeException;
}

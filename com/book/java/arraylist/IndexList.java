package com.book.java.arraylist;

public interface IndexList<E> {
	
	public int size();
	public boolean isEmpty();
	
	public void add(int i, E e) throws IndexOutOfBoundsException;
	public E remove(int i, E e) throws IndexOutOfBoundsException;
	public E get(int i);
	public E set(int i, E e) throws IndexOutOfBoundsException;
}

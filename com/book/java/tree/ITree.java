package com.book.java.tree;

import java.util.Iterator;

public interface ITree<E> {

	// Normal method
	public E element();
	
	// Generic methods
	public int size();
	public boolean isEmpty();
	public Iterator<E> iterator();
	public Iterable<Position<E>> positions();
	public E replace(Position<E> v, E e) throws InvalidPositionException;
	
	// Query methods
	public boolean isInternal(Position<E> v);
	public boolean isExternal(Position<E> v);
	public boolean isRoot(Position<E> v);
	
	// Accessor methods
	public Position<E> root() throws EmptyTreeException;
	public Position<E> parent(Position<E> v) throws InvalidPositionException, BoundaryViolationException;
	public Iterable<Position<E>> children(Position<E> v) throws InvalidPositionException;
	
}

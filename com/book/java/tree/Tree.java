package com.book.java.tree;

import java.util.Iterator;

public class Tree<E> implements ITree<Integer> {

	@Override
	public Integer element() {
		return null;
	}

	@Override
	public int size() {
		return 0;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public Iterator<Integer> iterator() {
		return null;
	}

	@Override
	public Iterable<Position<Integer>> positions() {
		return null;
	}

	@Override
	public Integer replace(Position<Integer> v, Integer e)
			throws InvalidPositionException {
		return null;
	}

	@Override
	public boolean isInternal(Position<Integer> v) {
		return false;
	}

	@Override
	public boolean isExternal(Position<Integer> v) {
		return false;
	}

	@Override
	public boolean isRoot(Position<Integer> v) {
		return false;
	}

	@Override
	public Position<Integer> root() throws EmptyTreeException {
		return null;
	}

	@Override
	public Position<Integer> parent(Position<Integer> v)
			throws InvalidPositionException, BoundaryViolationException {
		return null;
	}

	@Override
	public Iterable<Position<Integer>> children(Position<Integer> v)
			throws InvalidPositionException {
		return null;
	}
	
	// Get depth of a node v in Tree T
	public int depth(ITree<E> T, Position<E> v) {
		if(T.isRoot(v)) {
			return 0;
		}else {
			return 1 + depth(T, T.parent(v));
		}
	}
	
	// 

}

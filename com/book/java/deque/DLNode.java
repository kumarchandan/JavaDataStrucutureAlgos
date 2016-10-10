package com.book.java.deque;

public class DLNode<E> {
	
	protected E element;
	protected DLNode<E> next, previous;
	
	public DLNode() {
		
	}
	
	public DLNode(E element, DLNode<E> next, DLNode<E> previous) {
		super();
		this.element = element;
		this.next = next;
		this.previous = previous;
	}

	public E getElement() {
		return element;
	}

	public DLNode<E> getNext() {
		return next;
	}

	public DLNode<E> getPrevious() {
		return previous;
	}

	public void setElement(E element) {
		this.element = element;
	}

	public void setNext(DLNode<E> next) {
		this.next = next;
	}

	public void setPrevious(DLNode<E> previous) {
		this.previous = previous;
	}
}


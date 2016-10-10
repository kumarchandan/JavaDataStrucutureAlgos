package com.book.java.deque;

public class NodeDeque<E> implements IDeque<E> {
	
	protected DLNode<E> header;
	protected DLNode<E> trailer;
	protected String element;
	protected int size;

	public NodeDeque() {
		super();
		this.header = new DLNode<E>();
		this.trailer = new DLNode<E>();
		header.setNext(trailer);
		trailer.setPrevious(header);
		this.size = 0;
	}

	@Override
	public boolean isEmpty() {
		return (size <= 0);
	}

	@Override
	public int size() throws EmptyDequeException {
		return size;
	}

	@Override
	public void addFirst(E e) {
		
		DLNode<E> second = header.getNext();
		DLNode<E> first = new DLNode<E>(e, second, header);
		second.setPrevious(first);
		header.setNext(first);
		size++;
		
	}

	@Override
	public void addLast(E e) {
		
		DLNode<E> second = trailer.getPrevious();
		DLNode<E> last = new DLNode<E>(e, trailer, second);
		second.setPrevious(last);
		trailer.setPrevious(last);
		size++;
	}

	@Override
	public E removeFirst() throws EmptyDequeException {
		size--;
		return null;
	}

	@Override
	public E removeLast() throws EmptyDequeException {
		size--;
		return null;
	}

	@Override
	public E getFirst() throws EmptyDequeException {
		return header.getElement();
	}

	@Override
	public E getLast() throws EmptyDequeException {
		return trailer.getElement();
	}
	
	// Test Main
	public static void main(String[] args) {
		NodeDeque<String> nodeDeque = new NodeDeque<String>();
		nodeDeque.addFirst("First");
		nodeDeque.addLast("last");
		nodeDeque.addFirst("otherFirst");
		nodeDeque.addLast("otherLastOne");
	}
	
}

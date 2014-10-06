package com.book.java.linkedlists;

public class TestCircularLList {

	/**
	 * @Author Chandan Kumar
	 */
	public static void main(String[] args) {
		
		Node nodeObj1 = new Node("First", null);
		Node nodeObj2 = new Node("Second", null);
		Node nodeObj3 = new Node("Third", null);
		Node nodeObj4 = new Node("Fourth", null);
		
		CircularlyLinkedList clist = new CircularlyLinkedList();
		
		clist.add(nodeObj1);
		clist.add(nodeObj2);
		clist.add(nodeObj3);
		clist.add(nodeObj4);
		
		System.out.println("Elements in circular list are: "+clist.toString());
		System.out.println("Cursor is :"+clist.getCursor().getElement());
		System.out.println(clist.remove().getElement());
		System.out.println("Elements in circular list after deletion are: "+clist.toString());
	}

}

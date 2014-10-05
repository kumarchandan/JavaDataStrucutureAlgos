package com.book.java.linkedlists;

public class TestLinkedList {

	/**
	 * @Author	Chandan Kumar
	 */
	public static void main(String[] args) {
		
		Node nodeObj1 = new Node("First", null);
		Node nodeObj2 = new Node("Second", null);
		Node nodeObj3 = new Node("Third", null);
		Node nodeObj4 = new Node("Fourth", null);
		
		SinglyLinkedList singlyList = new SinglyLinkedList();
		
		singlyList.addFirst(nodeObj1);
		singlyList.addFirst(nodeObj2);
		singlyList.addLast(nodeObj3);
		singlyList.addLast(nodeObj4);
		
		System.out.println("Node size: "+singlyList.getSize()+" First elem in list: "+singlyList.getFirstElement()+" Last elem in list: "+singlyList.getLastElement());
		
//		singlyList.traverse();
	}
}

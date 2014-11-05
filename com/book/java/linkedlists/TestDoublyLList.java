package com.book.java.linkedlists;

public class TestDoublyLList {

	/**
	 * @Author Chandan Kumar
	 */
	public static void main(String[] args) {
		
		DoublyNode dnode1 = new DoublyNode("First", null, null);
		DoublyNode dnode2 = new DoublyNode("Second", null, null);
		DoublyNode dnode3 = new DoublyNode("Third", null, null);
		DoublyNode dnode4 = new DoublyNode("Fourth", null, null);
		DoublyNode dnode5 = new DoublyNode("Fifth", null, null);
		
		DoublyLinkedList doublyList = new DoublyLinkedList();
		
		doublyList.addFirst(dnode2);
		doublyList.addFirst(dnode1);
		
		doublyList.addLast(dnode4);
		doublyList.addLast(dnode5);
		
		doublyList.addBefore(dnode1, dnode3);
		doublyList.traverse();
		
		doublyList.removeNode(dnode1);
		
		doublyList.traverse();
		System.out.println(doublyList.hasNext(dnode5));
		System.out.println(doublyList.hasNext(dnode5.getNext()));
	}
}

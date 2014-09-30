package org.com.book.java.linkedlists;

public class TestLinkedList {

	/**
	 * @Author	Chandan Kumar
	 */
	public static void main(String[] args) {
		
		Node nodeObj1 = new Node("FirstElement", null);
		SLinkedList list1 = new SLinkedList();
		list1.addFirst(nodeObj1);
		
		Node nodeObj2 = new Node("SecondElement", nodeObj1);
		list1.addFirst(nodeObj2);
	}

}

package com.deekshith.leetcode.june;

public class LinkedList {

	public static void main(String[] args) {
		LinkedListNodes node = new LinkedListNodes(4);
		node.next = new LinkedListNodes(5);
		node.next.next = new LinkedListNodes(1);
		node.next.next.next = new LinkedListNodes(9);
		
		
		int nodetobedeleted = 5;
		
		while(node.data == nodetobedeleted) {
			node = node.next;
			break;
		}
		
		node.next = node.next.next;
		
		while(node!=null) {
			System.out.println(node.data);
			node = node.next;
		}
	}

}

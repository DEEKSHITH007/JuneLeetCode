package com.deekshith.leetcode.june;

public class InvertBinaryTree {

	public static void main(String[] args) {
		Node root = new Node(4);
		root.left = new Node(2);
		root.right = new Node(7);
		root.left.left = new Node(1);
		root.left.right = new Node(3);
		root.right.left = new Node(6);
		root.right.right = new Node(9);
		
		
		
		Node node = root;
		while(root!=null) {
			node.right = root.left;
			node.left = root.right;
			node = node.left;
			root = root.right;
		}
		
	}

}

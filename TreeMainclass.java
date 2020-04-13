package com.datastructures.tree;

public class TreeMainclass {

	public static void main(String[] args) {
		System.out.println("main() starts.........");
		
		BinaryTree tree = new BinaryTree(10);
		
		for (int i = 1; i <=10; i++) {
			tree.insert(i*10);
		}
		System.out.println("Level-Order Traversing");
		tree.levelOrder();
		System.out.println();
		System.out.println("Pre-Order Traversing");
		tree.preOrder(1);
		System.out.println("\nPost-Order Traversing");
		tree.postOrder(1);
		System.out.println("\nIn-Order Traversing");
		tree.inOrder(1);
		tree.delete(20);
		tree.levelOrder();
		System.out.println("\nmain() ends...........");
	}

}






package com.datastructures.tree;

public class BinaryTree {

	private int arr[] = null;
	private int lastUsedIndex = Integer.MIN_VALUE;

	public BinaryTree(int size) {

		this.arr = new int[size + 1];
		this.lastUsedIndex = 0;
		System.out.println("succussfully created an empty binary tree");
	}

	public void insert(int valueToBeInsert) {
		if (isTreeFull()) {
			System.out.println("Tree is Full !!!");
		} else {
			arr[lastUsedIndex + 1] = valueToBeInsert;
			lastUsedIndex++;
			System.out.println(valueToBeInsert + " is inserted to tree");
		}
	}
	
	public void levelOrder() {
		for (int i =1; i <=lastUsedIndex; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public void preOrder(int index) {
		if(index>lastUsedIndex) { //10
			return;
		}
		System.out.print(arr[index]+" ");
		preOrder(index * 2);
		preOrder(index * 2 + 1);
	}// 3 , 5 , 9, 17
	
	public void postOrder(int index) {
		if(index>lastUsedIndex) {
			return;
		}
		preOrder(index * 2);
		preOrder(index * 2 +1);
		System.out.print(arr[index]+" ");
	}
	
	public void inOrder(int index) {
		if(index>lastUsedIndex) {
			return;
		}
		preOrder(index * 2);
		System.out.print(arr[index]+" ");
		preOrder(index * 2 +1);
	}
	
	public int search(int valueToBeSearch) {
		for (int i =1; i <=lastUsedIndex; i++) {
			if(arr[i]==valueToBeSearch) {
				System.out.println(valueToBeSearch+"is found at index : "+i);
				return i;
			}
		}
		System.out.println(valueToBeSearch+" is not found");
				return -1;
	}
	
	public void delete(int valueToBeDelete) {
		int value=search(valueToBeDelete);
		if(value==-1) {
			return;
		}else {
			arr[value]=arr[lastUsedIndex];
			lastUsedIndex--;
		}
	}
	
	public boolean isTreeFull() {
		if (lastUsedIndex == arr.length - 1) {
			return true;
		} else {
			return false;
		}
	}
	public void deleteBinaryTree() {
		System.out.println("deleting binary tree....");
		this.arr=null;
		System.out.println("Binary Tree Deleted");
	}
}









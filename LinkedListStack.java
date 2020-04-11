package com.datastructures.stack;

import com.datastructures.linkedlist.SingleLinkedList;

public class LinkedListStack {
	private SingleLinkedList list=null;
	
	public LinkedListStack() {
		this.list=new SingleLinkedList();
		System.out.println("succussfully created an empty stack");
	}
	public void push(int valueToBeInsert) {
		if(isEmpty()) {
			list.createLinkedList(valueToBeInsert);
			
		}else {
			list.insertValue(0, valueToBeInsert);
		}
		System.out.println(valueToBeInsert+" is inserted to stack");
	}
	
	public void pop() {
		if(isEmpty()) {
			System.out.println("stack underflow error !!!");
		}else {
			System.out.println(list.getHead().getValue()+" is removed from stack");
		    list.deleteNode(0);
		}
	}
	public void peek() {
		if(isEmpty()) {
			System.out.println("stack underflow error !!!");
		}else {
			System.out.println(list.getHead().getValue()+" is present at the top of stack");
		}
	}
	public boolean isEmpty() {
		if(list.getHead()==null) {
			return true;
		}else {
			return false;
		}
	}
	public void deleteStack() {
		System.out.println("stack is deleting.......");
		this.list=null;
		System.out.println("stack deleted.......");
	}
}










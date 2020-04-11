package com.datastructures.queue;

import com.datastructures.linkedlist.SingleLinkedList;

public class LinkedListQueue {

	private SingleLinkedList list = null;

	public LinkedListQueue() {
		this.list = new SingleLinkedList();
		System.out.println("succussfully created an empty Queue");
	}

	public void enQueue(int valueToBeInsert) {
		if (isEmpty()) {
			list.createLinkedList(valueToBeInsert);
		} else {
			list.insertValue(list.getSize(), valueToBeInsert);
		}
		System.out.println(valueToBeInsert + " is inserted to Queue");
	}
	
	public void deQueue() {
		if(isEmpty()) {
			System.out.println("Queue underflow error !!!");
		}else {
			System.out.println(list.getHead().getValue()+" is removed from the Queue");
			list.deleteNode(0);
		}
	}
	public void peekInQueue() {
		if(isEmpty()) {
			System.out.println("Queue underflow error !!!");
		}else {
			System.out.println(list.getHead().getValue()+" is present at top of the Queue");
		}
	}
	public boolean isEmpty() {
		if (list.getHead() == null) {
			return true;
		} else {
			return false;
		}
	}
	public void deleteQueue() {
		System.out.println("Queue is deleting........");
		this.list=null;
		System.out.println("Queue deleted");
	}
}








package com.datastructures.queue;

public class Queue {
	
	private Object[] arr=null;
	private int startPointer=Integer.MIN_VALUE;
	private int endPointer=Integer.MIN_VALUE;
	
	public Queue(int size) {
		this.arr=new Object[size];
		this.startPointer=-1;
		this.endPointer=-1;
		System.out.println("succussfully created an empty queue");
	}
	public void enQueue(Object valueToBeInsert) {
		if(isFull()) {
			System.out.println("Queue overflow error !!!");
		}else {
			arr[startPointer+1]=valueToBeInsert;
			startPointer++;
			System.out.println(valueToBeInsert+" is inserted to Queue");
		}
	}
	public void deQueue() {
		if(isEmpty()) {
			System.out.println("Queue underflow error !!!");
		}else {
			System.out.println(arr[endPointer+1]+" is removed from Queue");
			endPointer++;
			if(startPointer==endPointer) {
				startPointer=endPointer=-1;
			}
		 }
	}
	public void peekInQueue() {
		if(isEmpty()) {
			System.out.println("Queue underflow error !!!");
		}else {
			System.out.println(arr[endPointer+1]+" is present at top of the Queue");
		}
	}
	public boolean isEmpty()
	{
		if(startPointer==-1) {
			return true;
		}else {
			return false;
		}
	}
	public boolean isFull() {
		if(startPointer==arr.length-1) {
			return true;
		}else {
			return false;
		}
	}
	public void deleteQueue() {
		System.out.println("Queue is deleting...");
		this.arr=null;
		System.out.println("Queue deleted");
	}
}














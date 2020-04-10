package com.datastructures.stack;

public class Stack {
	
	private Object []arr=null;
	private int startPointer=Integer.MIN_VALUE;
	
	public Stack(int size) {// size = 5
		this.arr=new Object[size];
		this.startPointer=-1;
		System.out.println("succussfully created an empty stack");
	}
	public void push(Object valueToBeInsert) {
		if(isFull()) {
			System.out.println("stack  overflow error !!!");
		}else {
			arr[startPointer+1]=valueToBeInsert;//-1
			startPointer++;//0
			System.out.println(valueToBeInsert+" is inserted to stack");
		}
	}
	public void pop() {
		if(isEmpty()) {
			System.out.println("stack underflow error !!!");
		}else {
			System.out.println(arr[startPointer]+" is popping from stack");
			startPointer--;
		}
	}
	public void peek() {
		if(isEmpty()) {
			System.out.println("stack underflow error !!!");
		}else {
			System.out.println(arr[startPointer]+" is present at the top of stack");
		}
	}
	public boolean isFull() {
		if(startPointer==arr.length-1) {
			System.out.println("stack is full");
			return true;
		}else {
			System.out.println("stack is not full");
			return false;
		}
	}
	public boolean isEmpty() {
		if(startPointer==-1) {
			System.out.println("stack is empty");
			return true;
		}else {
			System.out.println("stack is not empty");
			return false;
		}
	}
	public void deleteStack() {
		System.out.println("deleting stack.....");
		this.arr=null;
		System.out.println();
	}
}

















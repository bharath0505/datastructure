package com.datastructures.linkedlist;

public class SingleLinkedList {
	private SingleNode head=null;
	private SingleNode tail=null;
	private int size=0;
	
	public SingleLinkedList() {
		System.out.println("SingleLinkedList Object is Created");
	}
	public SingleNode createLinkedList(int valueToBeInsert) {
		head=new SingleNode();
		SingleNode node = new SingleNode();
		node.setValue(valueToBeInsert);
		node.setNext(null);
		head=node;
		tail=node;
		//tail.setNext(head);
		size=1;
		return head;
	}
	public void insertValue(int location,int valueToBeInsert) {
		
		SingleNode node = new SingleNode();
		node.setValue(valueToBeInsert);
		if(!existLinkedList()) {
			System.out.println("LinkedList does not exist !");
			return;
		}else if(location==0){
			node.setNext(head);
			head=node;
		}else if(location>=size) {
			node.setNext(null);
			tail.setNext(node);
			tail=node;
		}else {
			SingleNode temp=head;
			int index=0;
			while(index<=location-1) {
				temp=temp.getNext();
				index++;
			}
			SingleNode next = temp.getNext();
			temp.setNext(node);
			node.setNext(next);
		}
		setSize(getSize()+1);
	}
	public void traverseLinkedList() {
		if(existLinkedList()) {
			SingleNode temp=head;
			for (int i = 0; i <getSize(); i++) {
				System.out.print(temp.getValue());
				if(i !=getSize()-1) {
					System.out.print("--->");
				}
				temp=temp.getNext();
			}
			System.out.println();
		}else {
			System.out.println("LinkedList does not exist !");
		}
	}
	public void searchValue(int valueToBeSearch) {
		if(existLinkedList()) {
			SingleNode temp=head;
			for (int i = 0; i <getSize(); i++) {
				if(temp.getValue()==valueToBeSearch) {
					System.out.println(valueToBeSearch+" is found at location "+i);
					return;
				}
				temp=temp.getNext();
			}
			System.out.println(valueToBeSearch+" is not found");
		}else {
			System.out.println("LinkedList does not exist !");
		}
	}
	
	public void deleteNode(int location) {
		if(!existLinkedList()) {
			System.out.println("LinkedList does not exist !");
			return;
		}else if(location==0)
		{
			head=head.getNext();
			setSize(getSize()-1);
			if(getSize()==0) {
				tail=null;
			}
		}else if(location>=getSize()) {
			SingleNode temp=head;
			for (int i = 0; i <getSize()-1; i++) {
				temp=temp.getNext();
			}
			if(temp==head) {
				head=tail=null;
				setSize(getSize()-1);
			}
			temp.setNext(null);
			tail=temp;
			setSize(getSize()-1);
		}else {
			SingleNode temp=head;
			for (int i = 0; i <location-1; i++) {
				temp=temp.getNext();
			}
			temp.setNext(temp.getNext().getNext());
			setSize(getSize()-1);
		}
	}
	
	public void deleteLinkedList() {
		System.out.println("deleting linkedlist......");
		head=tail=null;
		System.out.println("singlelinkedlist is deleted.....");
	}
	
	public boolean existLinkedList() {
		return head != null;
	}
	public SingleNode getHead() {
		return head;
	}
	public void setHead(SingleNode head) {
		this.head = head;
	}
	public SingleNode getTail() {
		return tail;
	}
	public void setTail(SingleNode tail) {
		this.tail = tail;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
}

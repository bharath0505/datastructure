package com.datastructures.queue;

public class QueueMainclass {

	public static void main(String[] args) {
		System.out.println("main() starts......");
		
		//Queue queue = new Queue(5);
		LinkedListQueue queue = new LinkedListQueue();
		queue.enQueue(10);
		queue.enQueue(20);
		queue.enQueue(30);
		queue.enQueue(40);
		queue.enQueue(50);
		
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		queue.deleteQueue();
		System.out.println("main() ends..........");
	}

}

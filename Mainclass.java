package com.datastructures.stack;

public class Mainclass {

	public static void main(String[] args) {
		System.out.println("main() starts......");
		
		Stack stack = new Stack(5);
		boolean bool1 = stack.isFull();
		System.out.println("isFull() : "+bool1);
		stack.push("java");
		stack.push("sql");
		stack.push("j2ee");
		stack.pop();
		
		
		boolean bool2 = stack.isEmpty();
		System.out.println("isEmpty : "+bool2);
		stack.peek();
		stack.peek();
		stack.deleteStack();
		System.out.println("main() ends......");
	}

}

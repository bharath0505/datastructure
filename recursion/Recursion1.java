package com.datastructures.recursion;

public class Recursion1 {
	
	public static void displayIteration()
	{
		for (int i = 1; i <=5; i++) {
			System.out.println("Welcome to D.S......");
		}
	}
	public static void displayRecursion(int count)
	{
		if(count>=1)
		{
			System.out.println(count+" : Welcome to D.S.....");
			count--;
			displayRecursion(count);
		}
	}
	public static void main(String[] args) {
		System.out.println("main() starts.........");
		
		//displayIteration();
		displayRecursion(5);
		
		System.out.println("main() ends...........");
	}

}

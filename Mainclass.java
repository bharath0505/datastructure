package com.datastructures.sort;

public class Mainclass {

	public static void main(String[] args) {
		System.out.println("main() starts.......");
		
		int a[]= {30,40,10,20,50};
		
		//BubbleSort bubbleSort = new BubbleSort();
		
		//SelectionSort selectionSort = new SelectionSort();
		
		InsertionSort insertionSort = new InsertionSort();
		
		System.out.println("Before Sorting...");
		insertionSort.display(a);
		
		int[] sort = insertionSort.sort(a);
		System.out.println("\nAfter Sorting.....");
		insertionSort.display(sort);
		
		System.out.println("\nmain() ends........");
	}

}

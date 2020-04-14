package com.datastructures.sort;

public class Mainclass {

	public static void main(String[] args) {
		System.out.println("main() starts.......");
		
		int a[]= {30,40,10,20,50};
		
		//BubbleSort bubbleSort = new BubbleSort();
		
		SelectionSort selectionSort = new SelectionSort();
		
		System.out.println("Before Sorting...");
		selectionSort.display(a);
		
		int[] sort = selectionSort.sort(a);
		System.out.println("\nAfter Sorting.....");
		selectionSort.display(sort);
		
		System.out.println("\nmain() ends........");
	}

}

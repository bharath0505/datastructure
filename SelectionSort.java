package com.datastructures.sort;

public class SelectionSort {
	
	public int[] sort(int a[]) {
		
		for (int j = 0; j < a.length; j++) {
			int minimumIndex=j;
			for (int i =j+1; i < a.length; i++) {
				if(a[i]<a[minimumIndex]) {
					minimumIndex=i;
				}
			}
				if(minimumIndex!=j) {
					int temp=a[j];
					a[j]=a[minimumIndex];
					a[minimumIndex]=temp;
				}
			
		}
		
		return a;
	}
	public void display(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}

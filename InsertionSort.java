package com.datastructures.sort;

public class InsertionSort {
	
	public int[] sort(int a[]) {
		
		for (int i = 1; i < a.length; i++) {
			int temp=a[i];
			int j=i;
			while(j>0 && a[j-1]>temp) {
				a[j]=a[j-1];
				j--;
			}
			a[j]=temp;
		}
		
		return a;
	}
	public void display(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}

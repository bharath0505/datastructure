package com.datastructures.arrays;

public class SingleDimensionArray {

	int arr[] = null;

	public SingleDimensionArray(int size) {
		this.arr = new int[size];
		System.out.println("array created");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.MIN_VALUE;
		}
	}

	public void traverseArray() {
		try {
			for (int i = 0; i < arr.length; i++) {
				System.out.print("arr[" + i + "] is : " + arr[i] + " ");
			}
			System.out.println();
		} catch (Exception e) {
			System.out.println("Array does not exist");
		}
	}

	public void insertValue(int index, int valueToBeInsert) {
		try {
			if (arr[index] == Integer.MIN_VALUE) {
				arr[index] = valueToBeInsert;
				System.out.println("value " + valueToBeInsert + " is inserted at index: " + index);
			} else {
				System.out.println("index is occupied by some value ");
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Index");
		}
	}

	public void accessValue(int index) {
		try {
			System.out.println("Value " + arr[index] + " at index " + index);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Index");
		}
	}

	public void searchValue(int valueToBeSearch) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == valueToBeSearch) {
				System.out.println("value is " + valueToBeSearch + " found at index : " + i);
				return;
			}
		}
		System.out.println("value is not present in array");
	}

	public void deleteValue(int index) {
		try {
			arr[index] = Integer.MIN_VALUE;
			System.out.println("value is deleted at index : " + index);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Index");
		}
	}

	public void deleteArray() {
		this.arr=null;
		System.out.println("array deleted");
	}
}

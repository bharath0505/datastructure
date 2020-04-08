package com.datastructures.arrays;

public class TwoDimensionArray {

	int arr[][] = null;

	public TwoDimensionArray(int row, int col) {
		this.arr = new int[row][col];//O(1) || O(mn)
		System.out.println("Two Dimension is created");

		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr[r].length; c++) {
				arr[r][c] = Integer.MIN_VALUE;
			}
		}
	}

	public void traverseArray() {
		try {//O(mn) || O(1)
			for (int r = 0; r < arr.length; r++) {
				for (int c = 0; c < arr[r].length; c++) {
					System.out.print(arr[r][c] + " ");
				}
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println("Array does not exists");
		}
	}

	public void insertValue(int row, int col, int valueToBeInsert) {
		try {//O(1) || O(1)
			if (arr[row][col] == Integer.MIN_VALUE) {
				arr[row][col] = valueToBeInsert;
				System.out.println(valueToBeInsert + " value inserted at row " + row + " and column " + col);
			} else {
				System.out.println("cell is occupied at row " + row + " and column " + col);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid row or column");
		}
	}

	public void accessCell(int row, int col) {
		try {// O(1) || O(1)
			System.out.println(arr[row][col] + " is present at given row " + row + " and column " + col);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid row or column");
		}
	}

	public void searchValue(int valueToBeSearch) { //O(mn) || O(1)
		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr[r].length; c++) {
				if (arr[r][c] == valueToBeSearch) {
					System.out.println(valueToBeSearch + " is found at row " + r + " and column " + c);
					return;
				}
			}
		}
		System.out.println(valueToBeSearch + " is not found");
	}

	public void deleteValue(int row, int col) {// O(1) || O(1)
		try {
			arr[row][col] = Integer.MIN_VALUE;
			System.out.println("value is deleted at row " + row + " and column " + col + " !");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid row or column");
		}
	}

	public void deleteArray() {// O(1) 
		this.arr = null;
		System.out.println("Array deleted !");
	}
}

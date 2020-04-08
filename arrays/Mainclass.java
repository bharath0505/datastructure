package com.datastructures.arrays;

public class Mainclass {

	public static void main(String[] args) {
		System.out.println("main() starts.......");
		
		SingleDimensionArray sda = new SingleDimensionArray(3);
		sda.traverseArray();
		sda.insertValue(0,100);
		sda.insertValue(1,200);
		sda.insertValue(2,300);
		//sda.insertValue(1,400);
		//sda.insertValue(4,400);
		sda.traverseArray();
		//sda.accessValue(1);
		//sda.searchValue(200);
		sda.deleteValue(1);
		sda.traverseArray();
		
		sda.deleteArray();
		sda.traverseArray();
		System.out.println("main() ends.......");
	}

}

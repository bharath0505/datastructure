package com.datastructures.recursion;

public class Recursion3 {

	public static int fibUsingRecursion(int n) {
		if (n < 3) {
			return 1;
		} else {
			return fibUsingRecursion(n - 1) + fibUsingRecursion(n - 2);
			//                         2   + 1
		}
	}

	public static void main(String[] args) {
		System.out.println("main() starts..........");
		
		int res = fibUsingRecursion(0);
		System.out.println(res);
		
		
		System.out.println("main() ends............");
	}

}

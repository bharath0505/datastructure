package com.datastructures.recursion;

public class Recursion2 {

	public static int factUsingIteration(int num) {
		int product = 1;// 1 - unit
		if (num > 1) { // 1 - unit
			for (int i = 1; i <= num; i++) { // n - unit
				product = product * i;
			}
			return product; // 1 -unit
		}
		return product;// 1 - unit
	} // 1 + 1 + n + 1 + 1 ==== n O(n) ======>10sec

	public static int factUsingRecursion(int num) {
		if (num < 1) { // 1-unit
			return 1;// 1-unit
		} else {
			return num * factUsingRecursion(num - 1);
		}
	}//O(n2)======>100sec 

	public static void main(String[] args) {
		System.out.println("main() starts........");

		int res = factUsingIteration(-5);
		//int res = factUsingRecursion(5);
		System.out.println(res);
		System.out.println("main() ends..........");
	}

}

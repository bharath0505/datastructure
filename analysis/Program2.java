package com.datastructures.analysis;

public class Program2 {
	
	public static int add(int n)
	{
		int sum=0; //  1-unit
		for (int i = 1; i <=n; i++) { // n - unit
			sum = sum + i;
		}
		return sum; // 1 - unit
	}// O(n)
	public static void main(String[] args) {
		System.out.println("main() starts.........");
		
		int res = add(5);// 1 + 2 + 3 + 4 + 5 = 15
		System.out.println(res);
		
		System.out.println("main() ends.........");
	}

}

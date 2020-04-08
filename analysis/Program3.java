package com.datastructures.analysis;

public class Program3 {
	public static void multiply(int n1,int n2)// Co-ordinates
	{
		for (int i = 1; i <=n1; i++) { //   n - unit 10 sec
			for (int j =1; j <=n2; j++) {  // n - unit 10 sec
				System.out.println(i+" * "+j+" = "+i*j);
			}
			System.out.println("==========================");
		}
	}// n * n = n2 <--------> 10 * 10 = 100 sec     O(n2)
	public static void main(String[] args) {
		System.out.println("main() starts.........");
		
		multiply(3,10);
		
		System.out.println("main() ends...........");
	}

}

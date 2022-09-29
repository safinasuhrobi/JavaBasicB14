package com.syntax.class09;

public class HWLargestNumber {

	public static void main(String[] args) {
		
		//4. From an array of integer elements find the largest number.
		
		int[] num = {0, 5, 10, 15, 20, 25} ;
		
		int largestNum = 0;
		
		for (int i=0; i < num.length; i++) {
			
			if (num [i] > largestNum) {
				largestNum = num[i];
			}
		}
		System.out.println(largestNum);

		System.out.println("-----------------------------");
		
		int [] num1 = {5, 15, 35, 55, 90, 2};
		
		int largest = num[0];
		
		for (int n:num1) {
			
			if (n>largest) {
				 largest = n;
			}
		}
		System.out.println(largest);
		
	}

}

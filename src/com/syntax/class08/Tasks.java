package com.syntax.class08;

public class Tasks {

	public static void main(String[] args) {

		// Task 1 - from the range of 1 to 50 please find the sum of all even and odd
		// numbers

		int sumEven = 0;
		int sumOdd = 0;

		for (int i = 2; i <= 50; i++) {

			if (i % 2 == 0) {

				sumEven = sumEven + i;
				
			}
			if (i % 2 != 0) {
				
				sumOdd = sumOdd + i;

			}
			
		}
		System.out.println("Sum of even number = " + sumEven + " and " + "Sum of odd numbers = " +  sumOdd);
		
		
	}

}

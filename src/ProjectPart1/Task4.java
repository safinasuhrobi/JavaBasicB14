package ProjectPart1;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		
		// 4. Create a 2D array or integer type where you will store odd and even numbers. Develop a program which will identify/print the even numbers only.

		Scanner scanner = new Scanner (System.in);
	
		int[][] evenOdd = new int[2][4];
		
			for  (int i=0; i < evenOdd[0].length; i++) {
				System.out.println("Please enter the number");
				int number = scanner.nextInt();
				
				if (number % 2 ==0) {
					evenOdd[0][i] = number;
					System.out.println(number + " is Even number");
				} else {
					evenOdd [1][i] = number;
					System.out.println(number + " is Odd number");
				}
			}
			
			System.out.println("The end");
	
	}

}

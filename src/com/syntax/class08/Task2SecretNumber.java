package com.syntax.class08;

import java.util.Scanner;

public class Task2SecretNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);
		
		double user;
		double secretNumber = 0;
		
		do {
			System.out.println("Please guess the secret number");
			user = scanner.nextDouble();
			
			if (user == secretNumber) {
				System.out.println("You won");
				break;
			}
			
			
			
		} while (user != secretNumber);
		
		
		//Another Way
		
		int secret = 5;
		int guess;
		
		do {
			System.out.println("Please guess the secret number");
			guess = scanner.nextInt();
			
		} while (guess != secret)
;
		System.out.println("You won");
	}

}

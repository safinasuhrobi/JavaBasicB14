package com.syntax.class08;

import java.util.Scanner;

public class TasksForContinueBreakLoop {

	public static void main(String[] args) {
		
		//Task 1
		
		Scanner scanner = new Scanner (System.in);
		
		for (int i=1; i<=50; i++) {
			
			if (i==12 || i==21 || i==36) {
				continue;
			}
			
			System.out.println(i + " ");
		}

		
		//Task 2 
		
		String creditCard;
		
		do {
			System.out.println("Please apply for the credit card");
			creditCard = scanner.nextLine();
			if (creditCard.equals("yes")) {
				break;
			}
		} while (true);

		

	}

}

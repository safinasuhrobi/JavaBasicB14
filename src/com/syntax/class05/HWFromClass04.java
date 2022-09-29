package com.syntax.class05;

import java.util.Scanner;

public class HWFromClass04 {
	public static void mail (String [] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Do you have a credit card? Answer true or false");
		boolean result = scanner.nextBoolean();
		
		if (result) {
			
			System.out.println("What is your balance on your credit?");
			int balance = scanner.nextInt();
			
			if (balance>1000) {
				System.out.println("You need to pay immideately");
			} else {
				System.out.println("Your can spend more");
			}
		}else {
			System.out.println("We have a great offer for you ");
		}
		
		
	}

}

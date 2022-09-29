package com.syntax.class04;

import java.util.Scanner;

public class HWCreditCard {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner (System.in);
	
	System.out.println("Do you have credit card?");
	boolean hasCreditCard = scanner.nextBoolean();
	
	if (!hasCreditCard) {
		System.out.println("Would you like to open a Credit Card?");
		
		boolean creditCard = scanner.nextBoolean();
		

			
		
	}else {
		System.out.println("What is the balance in your credit card?");
		
		int cardBalance = scanner. nextInt();
		
		if(cardBalance > 1000) {
			System.out.println("You need to pay your balance off immidately");
			
		}else {
			System.out.println("You can spend more");
		}
	}
	
	
	}

}

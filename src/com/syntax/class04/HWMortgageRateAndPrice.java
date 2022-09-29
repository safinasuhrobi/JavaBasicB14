package com.syntax.class04;

import java.util.Scanner;

public class HWMortgageRateAndPrice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);

		System.out.println("What is the mortgage rate?");
		double mortgageRate = scanner.nextDouble();
		System.out.println("What is the mortgage price?");
		double mortgagePrice = scanner.nextDouble();
		
		
		if (mortgageRate > 4.5) {
			System.out.println("Client will not buy a house.");
		}else {
			System.out.println("Client will consider buying.");
			
			if (mortgagePrice > 200000) {
				System.out.println("Client will take loan.");
				
				double loan = scanner.nextDouble();
				System.out.println("How much loan do you need?");
				if (loan <= 200000) {
					System.out.println("I would lend the money.");
				} else {
					System.out.println("I would reject the client.");
				}

				
			}else {
				System.out.println("Client will pay cash");
			
				
			}
		}	

	}

}

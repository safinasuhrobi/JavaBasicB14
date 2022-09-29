package com.syntax.class08;

import java.util.Scanner;

public class TaskShopping {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("What do you like to buy?");
		String item = scanner.nextLine();
		System.out.println("How much does it cost?");
		Double price = scanner.nextDouble();
		Double money = 0.0;
		
		while (price != money) {
			System.out.println("Please give me money");
			money = money + scanner.nextDouble();
			if (price>money) {
				System.out.println("You have $" + (price - money) + " have left to pay");
			} else if (money > price) {
				System.out.println("You paid $" + (money - price) + " extra, here is your change" );
				break;
			} else {
				System.out.println("Thank you for shopping!");
				break;
			}
		} 

	}

}

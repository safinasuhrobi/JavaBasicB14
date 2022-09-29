package com.syntax.class07;

import java.util.Scanner;

public class HWPriceForCoffee {

	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);
		double price = 10.99;
		
		while (price>=0) {
		System.out.println("Please pay for your coffee");
		double pay = scanner.nextDouble();
		
		if (pay > price) {
			System.out.println("Please give less money");
		} else if (pay < price) {
			System.out.println("Please give more money");
		} else {
			System.out.println("Please enjoy your coffee");
			break;
			}
		}
		
		//ANOTHER WAY using "DO WHILE"
		
		double user;
		
		do {
			System.out.println("Please pay for your coffee");
			user = scanner.nextDouble();
			if (user > price) {
				System.out.println("Please give less money");
				
		} else if ( user < price ) {
			System.out.println("Please give more money");
			
			}
			
		} while (user != price);
		System.out.println("Please enjoy your coffee");
	}

}

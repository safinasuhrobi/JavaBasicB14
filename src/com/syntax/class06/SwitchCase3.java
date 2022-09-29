package com.syntax.class06;

import java.util.Scanner;

public class SwitchCase3 {

	public static void main(String[] args) {

		/*
		 * We need to ask a user where he/she is a from?
		 * base on the country, we need to define favorite food.
		 * 
		 */
		Scanner in = new Scanner (System.in);
		System.out.println("Please tell me where are you from?");
		String country = in.nextLine();
		String favoriteFood;
		
		switch (country) {
		case "Usa":
			favoriteFood="burgers and fries";
			break;
		case "Kazakhstan":
			favoriteFood="beshparmak";
			break;
		case "Venezuela":
			favoriteFood="arepa";
			break;
		case "India":
			favoriteFood="chicken curry";
			break;
		case "Tajikistan":
			favoriteFood="plov";
			break;
		case "Afghanistan":
			favoriteFood="qabuli palow";
			break;
		default:
			favoriteFood="Unknown";
			break;
		

	}
		System.out.println("You are from " + country + " and your favorite food is " + favoriteFood);

}
}

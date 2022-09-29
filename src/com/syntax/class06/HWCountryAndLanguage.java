package com.syntax.class06;

import java.util.Scanner;

public class HWCountryAndLanguage {

	public static void main(String[] args) {


		Scanner scanner = new Scanner (System.in);
		System.out.println("Which country are you from?");
		String country = scanner.nextLine();
		String language;
		
		switch (country) {
		case "America":
			language = "English";
			break;
		case "France":
			language = "French";
			break;
		case "Iran":
			language = "Farsi";
			break;
		case "Turkey":
			language = "Turkish";
			break;
		default:
			language = "Unknown";
			break;
			
		}
		System.out.println("You are from " + country + " you speak " + language + " language");

	}

}

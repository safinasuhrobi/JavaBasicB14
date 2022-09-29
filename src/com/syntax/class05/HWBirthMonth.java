package com.syntax.class05;

import java.util.Scanner;

public class HWBirthMonth {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Please enter your birthday month");
		String season = scanner.nextLine();
		
		if (season.equals("March") || season.equals("April") || season.equals("May")) {
			System.out.println("Spring");
		} else if (season.equals("June") || season.equals("July") || season.equals("August")) {
			System.out.println("Summer");
		} else if (season.equals("September") || season.equals("October") || season.equals("November")) {
			System.out.println("Fall");
		} else if (season.equals("December") || season.equals("January") || season.equals("February")) {
			System.out.println("Winter");
			
		}
		
	}

}

package com.syntax.class06;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {


		Scanner scanner = new Scanner (System.in);
		System.out.println("Please enter your birthday month");
		String seasonsOfTheYear = scanner.nextLine();
		
		String season = null;
		
		if (season.equals("March") || season.equals("April") || season.equals("May")) {
			season = "Spring";
		} else if (season.equals("June") || season.equals("July") || season.equals("August")) {
			season = "Summer";
		} else if (season.equals("September") || season.equals("October") || season.equals("November")) {
			season = "Fall";
		} else if (season.equals("December") || season.equals("January") || season.equals("February")) {
			season ="Winter";
			
		} else {
		
		System.out.println("You were born is season " + season);
		

	}

}
}

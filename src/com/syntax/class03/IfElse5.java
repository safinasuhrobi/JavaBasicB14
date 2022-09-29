package com.syntax.class03;

public class IfElse5 {

	public static void main(String[] args) {
		
		
		int number = 27;
		
		if (number != 26) {
			System.out.println("This number is not 26");
		}
		
		int day = 10;
		 
		if (day==1) {
			System.out.println("Monday");	
		}else if(day == 2) {
			System.out.println("Tuesday");
		}else if (day == 3 ) {
			System.out.println("Wednesday");
		}else if (day == 4) {
			System.out.println("Thursday");
		}else if (day == 5) {
			System.out.println("Friday");
		}else if (day == 6) {
			System.out.println("Saturday");
		}else if (day ==7) {
			System.out.println("Sunday");
		}else {
			System.out.println("Please enter valid dates");
		}

	}

}

package com.syntax.class06;

public class SwitchCase {

	public static void main(String[] args) {
		
		//SWITCH CASE -> executes one statement from multiple values or conditions;
		/*SYNTAX:
		 * switch (variable) {
		 * case value1:
		 * 		code A;
		 * 		break;
		 * case value2:
		 * 		code B
		 * 		break;
		 * }
		 */
		//if statement is condition based
		/*
		 * LIMITATIONS: 
		 * data type: CANNOT work with double, float, long, boolean
		 * 
		 * operators: CANNOT work with logical and relational
		 */
		
		int day = 8;
		 
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
			
		
		System.out.println("-----------------");
		
		String name;
		switch (day) {
		
		case 1: 
			name="Monday";
			break;		
		case 2:
			name="Tuesday";
			break;
		case 3:
			name="Wednesday";
			break;
		case 4:
			name="Thursday";
			break;
		case 5:
			name="Friday";
			break;
		case 6:
			name="Saturday";
			break;
		case 7:
			name="Sunday";
			break;
		default:
			name="Invalid";
			break;
		}
	}

}

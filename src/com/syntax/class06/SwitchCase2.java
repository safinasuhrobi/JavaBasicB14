package com.syntax.class06;

public class SwitchCase2 {

	public static void main(String[] args) {
		
		//matching cases must be same data type as a variable in switch
		//no diplicate cases in switch cases

		char choice = 'K';
		String answer;
		switch (choice) {
		
		case 'Y':
			answer="Yes";
			break;
		case 'N':
			answer="No";
			break;
		case 'M':
			answer="Maybe";
			break;
		default:
			answer="Unknown";
			break;
			
		}
		
		System.out.println(answer);
		
		//Limitation of SWITCH CASE
		/*
		 * Switch case cannot use logical operators
		 * Switch case cannot use relational operators
		 *  
		 */
		/*
		 * Switch case cannot work with boolean values: T or F
		 * Switch case cannot work with float, double and long
		 * 
		 */
		
	}

}

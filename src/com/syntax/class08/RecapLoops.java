package com.syntax.class08;

public class RecapLoops {

	public static void main(String[] args) {
		
		
		/* Loops in JAVA:
		 * 
		 * while
		 * go while
		 * for
		 * enhanced for loop/for each loop/advanced for loop
		 */

		/* FOR Loop -when we know number of repetitions/iterations in advance
		 * Syntax:
		 * for (initialization; condition; increment/decrement;) {
		 *		code to repeat;
		 * }
		 * 
		 */
		//HW Print even numbers from 20 to 1 (2 ways)
		
		for (int i= 20; i>=1; i-=2) {
			System.out.println(i+ " ");
		}
		 
		System.out.println();
		
		//Another way
		
		for (int i=20; i>1; i--) {
			
			if (i%2==0) {
				System.out.println(i + " ");
			}
		}
		
		//WHILE Loop and DO WHILE Loop -> if we don't know number of repititions
		
		/*WHILE vs DO WHILE =>
		 * While checks conditionm first -> then executes code
		 * Do While executes code -> then check condition
		 * 
		 * while (boolean condition) {
		 * 		code repeat
		 * }
		 * 
		 * do {
		 * 		code repeat
		 * } while (boolean condition);
		 * 
		 * 
		 */
	}

}

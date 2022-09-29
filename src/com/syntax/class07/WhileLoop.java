package com.syntax.class07;

public class WhileLoop {

	public static void main(String[] args) {
		
		//LOOP =  allows us to execute a statement or group of statement multiple times.
		/*We need loop to eliminate the code
		 * Also works with true and false conditions
		 */
		
		int time = 10;
		
		if (time<12) {
			System.out.println("good morning inside if statement");
		}
		
		/*
		 * infinate loopp
		 * 
		 * while (time<12) {
		 * 
		 * System.out.println ("good morning); 
		 * }
		 */
		
		while ( time>12) {
			System.out.println("good morning inside while loop");
			time++; // 10+1=11+1=12
			
		}
	}

}

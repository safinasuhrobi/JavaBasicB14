package com.syntax.class04;

public class NestedIfConditions {

	public static void main(String[] args) {
		
		/*
		 * Nested condition is simple box inside the box or if condition inside the if condition
		 * if the outter condition is 'true' then only inner conditions will be checked 
		 * if it's 'false' nothing from the inner condition will be executed=it's like a main door
		 * if main door is closed then we can't enter the building 
		 * 
		 */

		int time=9;
		String day="Monday"; 
		
		if (day.equals("Monday")) { //outer "if" condition. Also as String is nion-primitive we can use == signs, instead we have to use .equals
			
			if (time>7) { //inner "if" 
				System.out.println("Let's got to office");
			}
			
			if (time<6) {
				System.out.println("Let's rest more");
			}
			
		}
		
	}

}

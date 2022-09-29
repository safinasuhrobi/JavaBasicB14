package com.syntax.class05;

public class LogicalOR {

	public static void main(String[] args) {
		
		
		/*
		 * Logical OR ||
		 * true || true => true
		 * true || false => true
		 * false || true => true
		 * false || false => false
		 */

		String day = "Saturday";
		
		if (day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("I have Java class at Syntax-using logical OR");
			
		}
		
		System.out.println("----");
		
		if (day.equals("Saturday") && day.equals("Sunday")) {
			System.out.println("I have Java class at Syntax-using logical &&");
			
	}
		System.out.println("salary");
		
		double money = 120000;
		String title = "Automation Tester";
		
		if(title.equals("Automation Tester") || money == 120000) {
		System.out.println("Happy");
}
	
}
}
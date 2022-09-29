package com.syntax.class06;

public class LogicalNOT {

	public static void main(String[] args) {
		
		
		//Logical NOT "!" ->
		//Compiler -> always checks our code before giving it to JAVA to execute it.
		//Compiler can initialize variables to it to default values"
		/* int = 0;
		 * double = 0.0;
		 * boolean = false;
		 * String anf other non primitive = null;
		 */
		
		boolean boo = !true;
		System.out.println(boo); // false
		
		boolean boo1 = !false;
		System.out.println(boo1); // true
		
		boolean rain = true;
		
		if (!rain) {
			System.out.println("I will go for a walk");
		}
		
		String day = "Monday";
		if (!day.equals("Sunday")) {
			System.out.println("Today is not Sunday");
		}
		

		boolean checkBoxSelected = true;
		
		if (!checkBoxSelected) {
			System.out.println("I will click and select it");
		}
		
		
		
		
		System.out.println("End of the program");
		
	}

}

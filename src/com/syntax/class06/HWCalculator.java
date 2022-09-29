package com.syntax.class06;

import java.util.Scanner;

public class HWCalculator {

	
	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);
		System.out.println("Please enter your first number");
		int number1 = scanner.nextInt();
		System.out.println("Please enter your second number");
		int number2 = scanner.nextInt();
		System.out.println("Please enter an operator");
		String operator = scanner.next();
		
		
		if (operator.equals("+")) {
			System.out.println(number1 + number2);
		} else if (operator.equals ("-")) {
			System.out.println(number1 - number2);
		} else if (operator.equals ("*")) {
			System.out.println(number1 * number2);
		} else if (operator.equals ("/")) {
			System.out.println(number1 / number2);
		}
		
		switch (operator) {
		case "+":
		System.out.println(number1 + number2);
		break;
		case "-":
		System.out.println(number1 - number2);
		break;
		case "*":
		System.out.println(number1 * number2);
		break;
		case "/":
		System.out.println(number1 / number2);	
		default:
		System.out.println("Wrong operator");
		break;	
			
		}
		
	}
	
}
	

package com.syntax.class04;

import java.util.Scanner;

public class HWAnnualSalary {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("How long have you been working?");
		int yearsWorked = scanner.nextInt();
		System.out.println("What is your annual salary?");
		int annualSalary = scanner.nextInt();
		
		if (yearsWorked >= 5) {
			System.out.println("You are eligible for bonus");
			
			if (annualSalary > 50000) {
				System.out.println("bonus = 5000");
			}else {
				System.out.println("bonus = 3000");
			}
			
		}else {
			System.out.println("You are not eligible");
		}
		
	
		
	}

}

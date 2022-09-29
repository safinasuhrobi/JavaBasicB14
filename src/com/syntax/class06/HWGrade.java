package com.syntax.class06;

import java.util.Scanner;

public class HWGrade {

	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);
		System.out.println("Please enter your grade");
		String grade = scanner.nextLine();
		String explanation;
		
		switch (grade) {
		case "A":
			explanation = "Excellent";
			break;
		case "B":
			explanation = "Good";
			break;
		case "C":
			explanation = "Average";
			break;
		case "D":
			explanation = "Bad";
			break;
		case "F":
			explanation = "Fail";
			break;
		default:
			explanation = "Not Acceptable";
			break;
	
		}
			
		System.out.println("User entered " + grade + " and it's " + explanation);
		
	}

}

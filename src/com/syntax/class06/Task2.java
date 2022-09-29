package com.syntax.class06;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Please enter your quiz grade");
		double  quizScore= scanner.nextDouble();
		System.out.println("Please enter your midterm grade");
		double midtermScore = scanner.nextDouble();
		System.out.println("Please enter your final grade");
		double finalScore = scanner.nextDouble();
		
		double average = (quizScore+midtermScore+finalScore)/3 ;
		String grade = null;
		
		if(average>=90) {
			grade = "A";
			System.out.println("Grade: " + grade);
		} else if (average >= 70 && average <= 90) {
			grade = "B";
			System.out.println("Grade: " + grade);
		} else if (average >= 50 && average <= 70 ) {
			grade = "C";
			System.out.println("Grade: " + grade);
		} else if (average <=50) {
			grade = "F";
			System.out.println("Grade: " + grade);
			
		} else {
			System.out.println("Grade: " + grade);
		}
		
	}

}

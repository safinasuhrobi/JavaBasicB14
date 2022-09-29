package com.syntax.class04;

import java.util.Scanner;

public class HWDiploma {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Does user has a diploma?");
		boolean hasDiploma = scanner.nextBoolean();
		
		
		if (hasDiploma) {
			
			System.out.println("Congratulations!");
			System.out.println("what is your GPA score?");
			double gpaScore = scanner.nextDouble();
			
			
			if (gpaScore>=3.5) {
				System.out.println("You are eligible for scholarship");	
			}else {
				System.out.println("You should have studied harder");
			}
			
			
		}else {
			System.out.println("You should get a deegree.");
		}
			
		
		

	}

}

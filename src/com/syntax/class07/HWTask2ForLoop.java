package com.syntax.class07;

import java.util.Scanner;

public class HWTask2ForLoop {

	public static void main(String[] args) {
		
		
		//Task5 - Prompt the user to ask the name 3 times and print "Good afternoon +name...
		Scanner scanner = new Scanner (System.in);
		String name = null;
		
		for (int i=1; i<=3; i++) {
			System.out.println("Please enter your name");
			name = scanner.nextLine();
		
		}	
		System.out.println("Good afternoon " + name);
		
		
		// Another way 
		
		for (int i=1; i<=3; i++) {
			System.out.println("Please enter your name");
			String name1 = scanner.nextLine();
			System.out.println("Good afternoon " + name1);
		}
		
	}

}

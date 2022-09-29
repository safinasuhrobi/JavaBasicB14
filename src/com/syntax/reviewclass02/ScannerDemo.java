package com.syntax.reviewclass02;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		/*
		 * nextLine is a speacial method that can capture spaces and enters as well
		 * when we use any methos like nextInt() or nextBoolean(), nextDouble() and after that is we use nextLine() we need to discard that enter by using an extra nextLine() call
		 * 
		 */
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Please enter your name");
		String name = scanner.nextLine();
		
		System.out.println("Please enter your age");
		int age = scanner.nextInt();
		
		System.out.println(name + " is " + age + " years old");
	}

}

package com.syntax.class05;

import java.util.Scanner;

public class NextvsNextLine {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter your full name");
		
		String name = scan.nextLine();
		System.out.println(name);
		
	}

}

package com.syntax.class04;

import java.util.Scanner;

public class HWDmvRep {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner (System.in);
		System.out.println("How old are you?");
		int age = scanner.nextInt();
		
		
		if (age >= 18) {
			System.out.println("I will issue the driver license.");
		}else {
			System.out.println("I will offer them to get the learning permit");
		}
		
	}

}

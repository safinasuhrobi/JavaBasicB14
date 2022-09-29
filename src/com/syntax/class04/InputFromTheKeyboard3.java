package com.syntax.class04;

import java.util.Scanner;

public class InputFromTheKeyboard3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your age");
		int age = scanner.nextInt(); // we use nextInt if we want an 'int' type of data from the keyboard
		if (age<18) {
			System.out.println("You should go to school");
		}else {
			System.out.println("You should start work");
		}

	}

}

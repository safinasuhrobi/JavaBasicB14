package com.syntax.class04;

import java.util.Scanner;

public class InputFromTheKeyboard4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = scanner.nextLine(); //takes a String type inputs from the keyboard and stores it in name variable
		System.out.println("Please enter your age");
		int age=scanner.nextInt();//take an Int from the keybopard and stores it in age variable
		
		System.out.println("Hello " + name + ", you are " + age + " years old");
		
		
		
	}

}

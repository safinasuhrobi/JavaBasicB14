package com.syntax.class04;

import java.util.Scanner;

public class InputFromKeyboard {

	public static void main(String[] args) {
		/*
		 * Scanner is a class that helps us take us the input from the user
		 * it containes many different smaller modules called method that can help us to take String booleans basically all types of data from the keyboard
		 */
		Scanner input = new Scanner(System.in);//a message will be displayed to the user on the console to enter his/her name
		System.out.println("Please enter your name"); //activated the java program to take the input from the keyboard and store it inside the name variable
		String name = input.next();//prints whatever name user enters on the keyboard on the console
		
		System.out.println("Hello " + name + ", welcome back");
		
	}

}

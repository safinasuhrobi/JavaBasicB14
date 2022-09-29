package com.syntax.class05;

import java.util.Scanner;

public class RecapScanner {

	public static void main(String[] args) {
		
		//Scanner is a class=>input from user 
		Scanner input= new Scanner (System.in);	
		System.out.println("Please enter you name");
		
		String name = input.next ();
		
		System.out.println("How old are you " + name);
		int age = input.nextInt();
		System.out.println(name + " is " + age + " years old");
		
		System.out.println("How much money do you have " + name);
		double money = input.nextDouble();
		System.out.println(name + " has $ " + money);
		
		System.out.println(name + " what is your grade?");
		char grade = input.next().charAt(1);
		System.out.println(name + " has grade " + grade);
		
		System.out.println("Please enter another name");
		String newName = input.next();
		System.out.println("New name is " + newName);
		
		System.out.println("End");
	}
	

}

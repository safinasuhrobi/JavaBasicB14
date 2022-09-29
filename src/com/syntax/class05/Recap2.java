package com.syntax.class05;

public class Recap2 {
	
	/*
	 * To format code use
	 * 
	 * mac:cmd+shift+f
	 * windows:ctrl+shift+f
	 * 
	 */

	public static void main(String[] args) {

		boolean allergy = true;

		String allergyType = "pollen";

		if (allergy) {
			System.out.println("Let's check what allergy you have");

			if (allergyType.equalsIgnoreCase("Pollen")) {
				System.out.println("Try to stay indoors when trees are blooming");
			} else if (allergyType.equals("Peanut")) {
				System.out.println("Please stay away from peanuts");
			} else if (allergyType.equals("Dairy")) {
				System.out.println("Srat away from dairy products");
			} else {
				System.out.println("We need to do some test");
			}

		} else {
			System.out.println("You are lucky");
		}

	}

}

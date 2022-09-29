package com.syntax.class13;

public class StringDemo {

	public static void main(String[] args) {
		
		//Proper way of creating an object
		String str = new String("Java");
		//Simplier and shorter wat provided by Java Creators to make our life a little easier
		String name = "Java"; //Only works for String and Wrapper classes
		/*
		 * Counts the number of characters in string including the spaces
		 */
		System.out.println(str.length());
		System.out.println(name.length());
		
		if (name.length()>15) {
			System.out.println("Name can't be more than 15 characters");
		}
	}

}

package com.syntax.class13;

public class StringDemo2 {

	public static void main(String[] args) {
		
		String firstName = "Olena";
		String lastName = "Dudka";
		
		System.out.println(firstName+" "+lastName); //mostly used
		//Another way
		System.out.println(firstName.concat(" "+lastName));
		
		String str = " ";
		/*
		 * isEmpty() returns true if a String is empty thus method will return false even if you have a space in a String variable, however the isBlank() doesn't count spaces.
		 */
		System.out.println(str.isEmpty());
		System.out.println(str.isBlank());
		
		
	}

}

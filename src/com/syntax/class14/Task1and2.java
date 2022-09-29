package com.syntax.class14;

public class Task1and2 {

	public static void main(String[] args) {
		
		/*Task1:
		 * Create a String that will hold a sentence. Write a program to get a new String without any spaces.
		 */
		
		String str = "I love my family";
	
		System.out.println(str.replaceAll("\\s", ""));
		
		/* Task2:
		 * Create a String that should be combination of letters, numbers and special characters. Find out how many Alphanumeric(abd AZ 284) characters are there in the String.
		 */
		
		String str1 ="abcdefghIKLMNOP123456!@#$%";
		

		System.out.println(str1.replaceAll("[^a-zA-Z0-9]", ""));
		System.out.println(str1.length());
	}

}

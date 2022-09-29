package com.syntax.class13;

public class HomeWork1 {

	public static void main(String[] args) {
		/*
		 * Create a String anf if the String is not "empty" perform the following
		 * If the String has an odd number of characters and has 3 or more characters, print the character in the middle of the String
		 */
		
		String str = "Phone";
		int mid = str.length() / 2;
		if (str.length()% 2 !=0 && str.length() >= 3) {
			System.out.println(str.charAt(mid));
		}
		System.out.println("-----------------ANOTHER WAY------------------");
		
		
		String str2 = "Hello";
		int length = str2.length();
		if(!str2.isEmpty() && length %2 !=0 && length>=3) { 
			
			int middleIndex = length /2; //to find the middle character, we need to divide by 2
			System.out.println(str2.charAt(middleIndex));
			
		}
	}

}

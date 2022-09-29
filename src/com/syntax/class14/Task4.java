package com.syntax.class14;

public class Task4 {

	public static void main(String[] args) {
		
		/*
		 * How would you check if String is palindrome or not? 
		 * aba=> true
		 * Abbc =>false
		 * 
		 */
		
		String str = "aba";
		String str2 = "";
		
		for (int i=str.length()-1; i>=0; i--) {
			str2 = str2 + str.charAt(i);
		}
		if (str.equals(str2)) {
			System.out.println("Then the string is palindrome");
		} else {
			System.out.println("It's not polindrome");
		}

	}

}

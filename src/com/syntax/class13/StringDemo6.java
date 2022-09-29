package com.syntax.class13;

import java.util.Arrays;

public class StringDemo6 {

	public static void main(String[] args) {
		
		
		String str = "I love Java programming";
		
		char[] charArray = str.toCharArray();
		
		System.out.println(Arrays.toString(charArray));
		System.out.println(charArray[7]);

		
		int counter = 0;
		 
		for (char c:charArray) {
			
			if (c=='a') {
				counter++;
			}
		}
		System.out.println("Letter has appeared " + counter + " times");
	}

}

package com.syntax.class13;

public class StringDemo5 {

	public static void main(String[] args) {
		
		String str = "I love Java programming";
		/*
		 *charAt returns us the character at a specific index 
		 */
		System.out.println(str.charAt(2));
		
		for(int i=0; i < str.length(); i++) {
			if(!(str.charAt(i)== ' ')) { //ignoring the space
				System.out.println(str.charAt(i));
			}
			
		}

	}

}

package com.syntax.class09;

public class HWArrayReverseChar {

	public static void main(String[] args) {
		
		//HW5. Create an array to store char values and then print those in reverse order
		
		char[] letter = {'A', 'B', 'C', 'D', 'E'};
		
		for (int i = letter.length - 1; i>=0; i--) {
			System.out.println(letter[i]+ " ");
		}

	}

}

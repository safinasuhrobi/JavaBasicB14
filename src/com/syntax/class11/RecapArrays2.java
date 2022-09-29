package com.syntax.class11;

import java.util.Arrays;

public class RecapArrays2 {

	public static void main(String[] args) {
	
		String [] dresses = new String [] {"Evening dress", "Work dress", "Cocktail dress"};
		//last index is always size-1 because arrays
		//index start from zero
		System.out.println(dresses.length);
		
		for (int i=0; i < dresses.length; i++) {
			
			System.out.println("Let's try " + dresses[i]);
			
		}
		
		//Enhanced loop
		
		for (String dress:dresses) {
			System.out.println(dress);
		}
		System.out.println("************************");
		System.out.println(Arrays.toString(dresses));
	}

}

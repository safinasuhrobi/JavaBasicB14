package com.syntax.class13;

public class StringDemo8 {

	public static void main(String[] args) {
		
		String str = "Batch 14 is good 81255465 !@#$%%^ ASDBJ  khgsfa";
		/*
		 * 
		 * 
		 */
		
		System.out.println(str.replace("good", "Excellent"));
		System.out.println(str.replaceAll("[a-z]", "")); //removes all the lower case letters, instead # comes out 

	}

}

package com.syntax.class14;

public class StringDemo {

	public static void main(String[] args) {
		
		
		String str = "szfknghZXCVBNNM123456!@##$%^";
		System.out.println(str.replaceAll("[0-9]", "@")); //replacing all the numbers
		System.out.println(str.replaceAll("[0-9]", "")); //removing/replacing all the numbers
		System.out.println(str.replaceAll("[szfk]", "")); //removing/replacing all the lower case "sfk" letters
		System.out.println(str.replaceAll("[A-z]", "")); //removing/replacing all the alphabets
		System.out.println(str.replaceAll("[0-z]", "")); // all the numbers and letter are removed, except the special characters
		System.out.println(str.replaceAll("[^A-Z]", "")); //everything is removed except upper case letters
		System.out.println(str.replaceAll("[^a-zA-Z0-9]", "")); //removes all of the special characters
	}

}

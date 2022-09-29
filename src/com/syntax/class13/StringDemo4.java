package com.syntax.class13;

public class StringDemo4 {

	public static void main(String[] args) {
	
		String str = "Shah";
		String str2 = "Shah";
		String str3 = "Shah";
		
		if(str.equals("shah")) {
		System.out.println("I found it");	
		}
		
		if(str.equalsIgnoreCase("shah")) {
			System.out.println("I found it with equalsIgnoreCase");
		}

	}

}

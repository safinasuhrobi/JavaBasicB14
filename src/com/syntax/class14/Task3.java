package com.syntax.class14;

import java.util.Arrays;

public class Task3 {

	public static void main(String[] args) {
		
		/*
		 * You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?” How would you find out how many sentences are in that String?
		 * How would you reverse a String word by word? for example
		 * input=> This is sentence i want to reverse
		 * output=> sihT si ecnetnes i tnaw ot esrever
		 */
		
		String str = "Is it Sturday? Is it raining? Do we have a Java Class today?";
		String [] arr = str.split("[?]");
		
		System.out.println(Arrays.toString(arr));
	
		
		String str2 = "This is sentence i want to reverse";
		
		for (int i=str2.length()-1; i>=0; i--) {
			System.out.print(str2.charAt(i));
		}
	}

}

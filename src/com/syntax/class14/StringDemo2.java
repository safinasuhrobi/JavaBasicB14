package com.syntax.class14;

import java.util.Arrays;

public class StringDemo2 {

	public static void main(String[] args) {
		
		//Split the string 
		
		String str = "Batch 14 is really good";
		String [] arr = str.split(" "); //removing "t" from the Batch word
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[4]); //= good
		
		String str2 = "Today is Sunday. Sunday is good. Java is also good";
		String [] arr2 = str2.split("[.]");
		System.out.println(Arrays.toString(arr2));
		
	}

}

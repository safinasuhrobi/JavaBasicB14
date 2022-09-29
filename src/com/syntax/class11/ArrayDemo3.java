package com.syntax.class11;

import java.util.Arrays;

public class ArrayDemo3 {

	public static void main(String[] args) {
		//creates an array store elements in the array
		//then with help of anither arrat adds all the elements
		double size = 10;
		int [] arr = new int[10];
		
		int start = 11;
		
		for (int i=0; i<arr.length; i++) {
			arr[i]=start;
			start++;
			
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("**********************");
		
		int sum = 0;
		
		for (int number: arr) {
			sum = sum + number;
			
		}
		System.out.println(sum);
	}

}

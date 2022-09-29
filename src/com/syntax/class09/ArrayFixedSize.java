package com.syntax.class09;

public class ArrayFixedSize {

	public static void main(String[] args) {
		
		
		int[] numbers = new int[3];
		
		numbers[1]=12;
		numbers[2]=13;
		
		System.out.println(numbers[0]);

		
		System.out.println("--------Another example---------");
		
		String[] colors = new String[3];
		
		colors [0]="White";
		colors [1]="Black";
		colors [2]="Pink";
		//colors [3]="Red"; //an error=ArrayIndexOutOfBoundsException:3
		
		System.out.println(colors [2]);
	}

}

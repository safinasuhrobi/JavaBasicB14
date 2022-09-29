package com.syntax.class10;

public class Task1 {

	public static void main(String[] args) {


		String[][] arr = {
				
				{"Yusuf", "Hamza", "Adam", "John"},
				{"A", "B", "C", "D"},
				
				
		};
		//ENHANCED LOOP
		for (String[] singleArray:arr) { //loops over 1d or single array
			
			for (String el:singleArray) { //loops over each element of the 1d array
				
				System.out.println(el);
			}
			
		}
		
		System.out.println("--------------------------------------");
		
		
		//REGULAR LOOP
		for (int i=0; i<arr.length; i++) {
			
			for (int  j=0; j<arr[i].length; j++) {
				
				System.out.println(arr[i][j]+ " ");
			}
		}

	}

}

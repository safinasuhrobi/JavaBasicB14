package com.syntax.class10;

public class Countries2DArray {

	public static void main(String[] args) {
		
		
		String[][] countries = {
				
				{"USA", "Canada"},				
				{"Peru", "Columbia", "Brazil", "Argintina"},				
				{"Ethiopia", "Kenya", "Egypt"},				
				{"Germany", "Moldova", "Turkey", "Ukraine"},				
				{"China", "Tajikistan", "India"},				

		};
			System.out.println(countries.length); // 5 - total number of arrays or rows
			
			int elOf1Array = countries[0].length;
			System.out.println("# elements from 1 array/row = " + elOf1Array);
			
			int elOf2Array = countries[1].length;
			System.out.println("# elements from 2 array/row = " + elOf2Array);
			
			
			System.out.println("---------Getting all values from 2d array-----------");
			
			
			//ENHANCED LOOP
			for (String[] country:countries) {
				
				for (String c:country) {
					
					if(c.equals("Tajikistan")) {
						
						System.out.println(c+ " is my home country");
					} else {
		
					System.out.print(c+ " ");
					}
				}
				System.out.println();
			}
			
			System.out.println("-----------------------------------");
			
			//REGULAR LOOP
			for (int r=0; r < countries.length; r++) {
				
				for (int c=0; c < countries[r].length; c++) {
					
					System.out.print(countries[r][c] + " ");
				}
			}
	}

}

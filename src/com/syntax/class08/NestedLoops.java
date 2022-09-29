package com.syntax.class08;

public class NestedLoops {

	public static void main(String[] args) {
		
		
		//Nested Loops => loop inside another loop
		
		for (int i=1; i<3; i++) {  //----outer loop = controls inner loop
			
			System.out.println("Hello");
			
			for (int j=1; j<=3; j++) { //-----nested loop = depends on outer loop
				System.out.println("Bye");
				
			}
		}

		System.out.println("----------------------------------");
		
		for (int i=0; i<=2; i++) {  // 3 times
			
			for (int j=1; j<4; j++) { // 3 times
				
				System.out.println(i + " " + j);
			}
		}
		
		
		System.out.println("End of the code");
	}

}

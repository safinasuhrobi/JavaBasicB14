package com.syntax.class08;

public class ContinueKeyWord {

	public static void main(String[] args) {
		
		//Continue = continues to the next iterations/cycle
		//Moment Java sees continue -> it goes back to the beginning of the loop
		//It usually used inside some type of conditions
		
		for ( int i=1; i<5; i++) {
			
			if (i==3 ) {
				continue;
			}
			
			System.out.println("Hello");
			System.out.println("How are you?");
			System.out.println(i);
			
		}
		
		// I want to print numbers from 1 to 20 except number 3, 7 and 11.

		for (int i=1; i<=20; i++) {
			
			if (i==3 || i==7 || i==11) {
				continue;
			}
			
			System.out.println(i + " ");
		}
	}

}

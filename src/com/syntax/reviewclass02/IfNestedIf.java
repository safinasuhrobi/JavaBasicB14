package com.syntax.reviewclass02;

public class IfNestedIf {

	public static void main(String[] args) {
		
		//Nexted If Conditions=> are conditions which are dependent on each other
		/*If the outter condition is not true, inner condition is never checked inner condition is only checked when outer condition is passed
		 * 
		 */

		int money = 12;
		if ( money>10) { //outter condition is not true
			System.out.println("Let's buy some eggs");
			int numEggs = 2;
			
			if ( numEggs>0) {
				System.out.println("Let's boil the eggs");
			}
		}
		
	}

}

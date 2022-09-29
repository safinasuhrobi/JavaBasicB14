package com.syntax.reviewclass04;

public class LoopDemo2 {
	
	public static void main (String [] arg) {

	//we want to print this patern 10 8 6 4 2 0
		
		for (int  i=10; i>=0; i-=2) {
			
			System.out.println(i);
		}
		
		System.out.println("-----------------------------------");
		
		//Task 1 = print 1 3 7 9
		 
		for (int i=1; i<=9; i+=2) {
			
			if (i == 5) {
				continue;
			}
			System.out.println(i);
		}
	
	}
}	


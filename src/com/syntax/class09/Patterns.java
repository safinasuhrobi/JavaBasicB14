package com.syntax.class09;

public class Patterns {

	public static void main(String[] args) {
		
		for (int i=1; i<=4; i++) { // outer controls rows
			
			for (int a=1; a<=3; a++) { // inner controls inner
				
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}

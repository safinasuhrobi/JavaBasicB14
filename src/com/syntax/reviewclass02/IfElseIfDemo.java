package com.syntax.reviewclass02;

public class IfElseIfDemo {

	public static void main(String[] args) {
		
		/*
		 * if we need one outcome based on if conditions we use.
		 * if the outcomes are two we use "if else if" outcomes are more than that we can use "if else if.		 
		 * whenever you habve to check more than two conditions always use " if else if " conditions.
		 */
		
		int number = 0;
		
		if (number>0) {
			System.out.println("number is positive");
		}else if(number<0) {
			System.out.println("number is nagative");
		}else {
			System.out.println("number is zero");
		}

	}

}

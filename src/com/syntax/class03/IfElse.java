package com.syntax.class03;

public class IfElse {

	public static void main(String[] args) {
		
		/*
		 * If Else Conditions-help us to write code that can take the decisions based on data.
		 * In real life problems like testing a Website our programs need to make lots of decisions.
		 * ex:IF (the given username and password matches) {go to home page} ELSE {give user a warning}
		 * 
		 * 
		 */
		
		double money = 5;
		double kfcBurger = 11;

		if (money>kfcBurger) {
			System.out.println("yay i can enjoy the burger");
			
		}else {
			System.out.println("I should make somthing at home ");
		}
		
		if (true) {
			System.out.println("If block ");
			
		}
		
		if (true) {
			System.out.println("If block");
		}else {
			System.out.println("else block");
		}
		
		boolean isHungry = true;
		
		if (isHungry) {
			System.out.println("Let's eat something delicious");
		}else {
			System.out.println("Let's watch and do some coding from Youtube");
		}
		
		
	}

}

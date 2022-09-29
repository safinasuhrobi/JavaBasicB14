package com.syntax.class04;

public class NestedIfConditions2 {

	public static void main(String[] args) {
		
		double moneyInMyAccount=20000;
		String season= "Summer";
		
		if (season.equals("Summer")) {
		
			
			
			
			if (moneyInMyAccount>30000)	{
				System.out.println("It's time for vacation");
			}else {
				System.out.println("I need to save more");
			}
			
		}
		

	}

}

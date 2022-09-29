package com.syntax.class03;

public class IfElse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isHungry = false;
		
		if (isHungry) {
			System.out.println("Let's eat something");
		}
		
		if(3>2) {
			System.out.println("There is a true statement inside the paranthesis");
		}
		
		double myBankBalance = 2000;
		double theAmountToTransfer = 2500;
		
		if (myBankBalance>theAmountToTransfer) {
			System.out.println("Funds transferred successfully");
		}else {
			System.out.println("Please try again not enough balance");
		}
		
		
		
	}

}

package com.syntax.class04;

public class RecapFromClass03 {

	public static void main(String[] args) {
		
		
		boolean isHUngry=true;
		
		if (isHUngry) {
			System.out.println("Please eat something");
		}else {
			System.out.println("You will stay hungry");
		}
			
		
		//HW Double Comparison
		double value1=100;
		double value2=200;
		
		if (value1>value2) {
			System.out.println("value1 " + value1 + " is larger than value2 " + value2);
		}else {
			System.out.println("value2 " + value2 + " is larger than value1 " + value1);
		}
		

		//HW Temperature Check
		
		double temperature = 35;
		 
		if (temperature < 32) {
			System.out.println("Water will freeze with temperature " + temperature);
		} else {
			System.out.println("Water will NOT freeze with temperature " + temperature);
		}
		
		//HW Name of the Month
		
		int month=13;
		 
		if (month==1) {
			System.out.println("Janury");
		}else if (month==2) {
			System.out.println("February");
		}else if (month==3) {
			System.out.println("March");
		}else if (month==4) {
			System.out.println("April");
		}else if (month==5) {
			System.out.println("May");
		}else if (month==6) {
			System.out.println("June");
		}else if (month==7) {
			System.out.println("July");
		}else if (month==8) {
			System.out.println("August");
		}else if (month==9) {
			System.out.println("September");
		}else if (month==10) {
			System.out.println("October");
		}else if (month==11) {
			System.out.println("November");
		}else if (month==12) {
			System.out.println("December");
		}else {
			System.out.println("These are the months of the year");
		}
		
		//HW Even or Odd
		
		int number = 10;
		System.out.println(5%2);
		// if we take the modulus % of a number by 2 and the answer is 0, it is going to be an EVEN number;
		//otherwise it is an ODD number
		if (number % 2 == 0) {
			System.out.println("The number is Even");
		}else {
			System.out.println("The number is Odd");
		}
		
		//Pistive and Negative Number
		
		int number1 =1;
		if (number1>0) {
			System.out.println("the number is positive");
		}else if (number1<0) {
			System.out.println("the number is negative");
		}else {
			System.out.println("the number is positive nor negative");
		}
		
	}

}

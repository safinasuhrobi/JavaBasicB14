package com.syntax.class10;

public class RecapExample {

	public static void main(String[] args) {


		String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		
		for (String day: week) {
			
			if(day.equals("Sunday")) {
				
				System.out.println(day + " is fun day");
				
			}else if (day.equals("Friday")) {
				
				System.out.println(day + " is a relax day");
				
			} else {
				
				System.out.println(day + " is boring day");
			}
		}

	}

}

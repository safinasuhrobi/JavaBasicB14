package com.syntax.class03;

public class Recap {

	public static void main(String[] args) {
		/*
		 * String concatenation helps us to combine 2 Strings together;
		 * String concatenation helps us to combine a String with any primitive data type together
		 * 
		 */
		
		
		String firstName="Safina";
		String lastName="Suhrobi";
		String fullName=firstName+ " " +lastName;
		
		System.out.println(fullName);
		
		
		int houseNum=15;
		int aptNum=5;
		String streetName="Cavalier Ct";
		String city="Fairfax";
		String country="USA";
		String fullAddress=houseNum+""+aptNum+" "+streetName+" "+city+" "+country;
		
		System.out.println(fullAddress);
		
		String incompleteAddress=houseNum+city;
		
		String step1="is we subtract 10 from 5 we get =" +10; // results in a String 
		System.out.println(step1);
		//it's not defined java does not understand what to do when we ask java to subtract
		
		System.out.println("If we subtract 10 from 5 we get =" + (10-5));
		
			

	}

}

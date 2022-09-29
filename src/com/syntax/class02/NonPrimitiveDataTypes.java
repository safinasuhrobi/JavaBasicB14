package com.syntax.class02;

public class NonPrimitiveDataTypes {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub

		//String is the value represented in double quotes "";
		//String is one of the non primitive data type;
		
		String name="Safina"; //String name
		
		String address="123 address street"; //String address
		
		String phone="7036781323";
		
		String age="26"; //anything you enter inside "" -> becomes a String
		//age is always an integer
		
		System.out.println(name);
		
		// ex:"My name is" + Safina "+" is called concatenation/concatenate means to "attach"
		
		System.out.println("My name is "+name);
		
		// ex: Safina is 26
		
		System.out.println(name +" is "+ age);
	
		String fruit="apple";
		double price=1.99;
		
		/* to attach any value (int, double, boolean, char or String
		 * to a String
		 * we use PLUS + sign
		 * + next to the String acts as Concatenation
		 */
		
		System.out.println("The price of the " + fruit + " is " + price);
		fruit= "mango";
		price=5.99;
		System.out.println("The price of the " + fruit + " is " + price);
		
		
		
		
		
		
		
		
	}

}

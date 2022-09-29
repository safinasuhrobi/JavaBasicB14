package com.syntax.class12;

public class PhoneTester {

	public static void main(String[] args) {
		
		Phone iphone = new Phone ();
		iphone.make = "Apple";
		iphone.model = "Iphone 14 Pro Max";
		iphone.color = "White";
		iphone.year = 2022;
		iphone.storage=128;
		iphone.call();
		
		Phone samsung = new Phone();
		samsung.model = "S22 Ultra";
		samsung.make = "Samsung";
		samsung.year = 2022;
		samsung.call();
		
	}

}

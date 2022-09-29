package com.syntax.class12;

public class Phone {

	String make;
	String model;
	String color;
	int storage;
	double size;
	boolean cheap;
	int year;
	
	void call() {
		System.out.println("Calling...");
	}
	void takePicture() {
		System.out.println("Taking pictures...");
	}
	
	public static void main (String [] args) {
		//Name of class variable name = new Name of class();
		
		Phone iphone = new Phone();
		iphone.make = "Apple";
		iphone.model = "Iphone 14";
		iphone.color = "white";
		iphone.storage = 128;
		iphone.size = 6.8;
		iphone.cheap = false;
		
		System.out.println("Make " + iphone.make + " Model " + iphone.model);
		iphone.call();
		
		
		System.out.println("---------------------------");
		
		Phone samsungPhone = new Phone();
		samsungPhone.make = "Samsung";
		samsungPhone.model = "S22 ultra";
		samsungPhone.color = "Grey";
		samsungPhone.storage =128;
		samsungPhone.size = 6.7;
		samsungPhone.cheap = false;
		
		System.out.println(iphone.make);
		System.out.println(samsungPhone.make);
	}
	
}

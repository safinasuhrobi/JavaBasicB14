package com.syntax.class12;

public class HWPhone {
	
	String made;
	String model;
	String color;
	int storage;
	
	
	void text () {
		System.out.println("texting...");
	}
	
	void call () {
		System.out.println("dialing to call");
	}
	
	public static void main (String [] args) {
	
	
	HWPhone iphone = new HWPhone();
	iphone.made = "Apple";
	iphone.model = "Iphone 14";
	iphone.color = "White";
	iphone.storage = 256;

	System.out.println(iphone.model + " is the latest iphone");
	iphone.call();
	
	HWPhone samsung = new HWPhone();
	samsung.made = "Samsung";
	samsung.model = "GT-I7500 Galaxy";
	samsung.color = "Black";
	samsung.storage = 128;
	
	System.out.println(samsung.model + " is one of the oldest " + samsung.made + " phones");
	samsung.text();
	
	HWPhone pixel = new HWPhone();
	pixel.made = "Google";
	pixel.model = "6 Pro";
	pixel.color = "Stormy Black";
	pixel.storage = 1000;
	
	System.out.println("Pixel " + pixel.model + " has unlimited storage");
	pixel.call();
	}
}

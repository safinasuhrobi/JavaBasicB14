package com.syntax.class12;

public class HWDog {
	
	String breed;
	char gender;
	int age;
	
	void runs () {
		System.out.println("runs fast...");
	}
	
	void barks () {
		System.out.println("barks loud");
	}
	void eats () {
	System.out.println("eats too much");
	}

	public static void main (String [] args) {
		
		HWDog husky = new HWDog();
		husky.breed = "Siberian";
		husky.gender = 'F';
		husky.age = 7;
		
		System.out.println(husky.breed + " husky is a friedly dog");
		husky.barks();
		
		
		HWDog labrador = new HWDog();
		
		labrador.breed = "British";
		labrador.gender = 'M';
		labrador.age = 5;
		
		System.out.println(labrador.breed + " labradors are good at catching");
		labrador.runs();
		
		
		HWDog bulldog = new HWDog();
		
		bulldog.breed = "British";
		bulldog.gender = 'M';
		bulldog.age = 3;
		
		System.out.println(bulldog.breed + " bulldogs are very stubborn");
		bulldog.eats();
	}
}

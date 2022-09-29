package com.syntax.class09;

public class HWArrays {

	public static void main(String[] args) {
		
		//HW. 1. Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.
		
		String[] cars = new String [6];
		
		cars[0] = "Honda";
		cars[1] = "Toyota";
		cars[2] = "Ford";
		cars[3] = "Tesla";
		cars[4] = "Mustang";
		cars[5] = "Nissan";
		
		for(String type: cars) {
		
			System.out.println(type);
		}
		
	//2nd way
		
		String[] cars1 = {"GMC", "Toyota", "BMW", "Tesla", "Mustang", "Audi"};

		for (int i=0; i < cars1.length; i++) {
			
			System.out.println(cars1[i]);
		}
		
		//2. Create an array of animals and store 5 elements into it. Using 2 different loops print all elements from the array.
		
		String[] animals = new String[5];
		
		animals [0] ="dog";
		animals [1] ="cat";
		animals [2] ="lion";
		animals [3] ="tiger";
		animals [4] ="goat";
		
		for (String animal: animals) {
			System.out.println(animal);
		}
		//2nd way
		
		String[] animals1 = {"dog", "cat", "cow", "goat", "horse"};
		
		for (int i=0; i < animals1.length; i++) {
			System.out.println(animals1[i]);
		}
		
		
	
		
		
	}
}

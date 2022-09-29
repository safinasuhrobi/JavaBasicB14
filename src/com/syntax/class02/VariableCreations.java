package com.syntax.class02;

public class VariableCreations {

	public static void main(NonPrimitiveDataTypes[] args) {
		// TODO Auto-generated method stub
		
		//1st way to create a variable
		byte b=10; //create a variable and assign value;
		
		//2nd way to create a variable
		int i; //create a variable;
		i=100; //assign a value;
		
		//we need to create a variable only once;
		//then we can use it as many times we want/need during the program;
		
		//3rd way;
		int num1, num2, num3; //creating a variable = declare a variable
		
		num1=100; //assign value or initialize a variable or filling the variable
		num2=200;
		num3=300;
		
		//int num1=100; -> an error, duplicate variable
		
		// ? Can we change a value of a variable = YES
		
		System.out.println(num2); //answer is=200
		
		num2=2000;
		
		System.out.println(num2); //answer is=2000 because of the last value
		
		//1 variable can hold only 1 value at once;
		
		byte car1=50;
		short car2=500;
		int car3=50000;
		long car4=500000000l;
		System.out.println(car1);
		car1 = 51; //Reassigning
		
		float plane1=5.66F;
		double plane2=55.66;
		System.out.println(plane1);
		plane1=6.77F; //Reassigning
		
		char tickets='$';
		char country='?';
		System.out.println(tickets);
		tickets='!'; //Reassigning
		
		boolean expensive=true;
		boolean cheap=false;
		System.out.println(cheap);
		cheap=true; //Reassigning
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
		System.out.println(car4);
		
		System.out.println(plane1);
		System.out.println(plane2);
		
		System.out.println(tickets);
		System.out.println(country);
		
		System.out.println(expensive);
		System.out.println(cheap);
		
		
	
		
		

	}

}

package com.syntax.class01;

public class PrimitiveDataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Java provides 2 different types: Primitive and NonPrimitive
		
		//storing and representing numeric values; box is a variable
		byte box1=127;
		
		short box2=32767;
		
		int box3=10000; //popular, uses a lot
		
		long box4=1000000000000l; //need to enter "l" when the number is too long. ex:credit card, transaction #s
		
		//storing and representing decimal values; 
		float variable1=1.99F; //for float add "f" after each number; float is smaller data type
		double variable2=99.99; // popular, long type of values

		//storing sing character, single character single quotes
		
		char container='A';
		char dollar='$';
		
		//storing "yes" or "no" values;
		boolean hot=true;
		boolean tired=false;
		
		System.out.println(variable2); //printing value of the variable;
		System.out.println("variable2"); //printing the text;
		System.out.println(tired);
		//System.out.println(variable3);//java gives an error, variable does not exist;
		
	}

}

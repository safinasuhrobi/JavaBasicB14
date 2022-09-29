package com.syntax.reviewclass02;

public class ReviewClassTypeCasting {

	public static void main(String[] args) {

		/*
		 * TYPE CASTING=>converting the type of data from one data to another one.
		 * 2 types of casting:
		 * 		1)Explicit/narrowing/manual =>larger data type to smaller data type
		 * 		2)Implicit/widening/automatic =>smaller data type to larger data type
		 * data types:
		 * byte=8
		 * short=16
		 * char=16
		 * int=32
		 * long=64
		 * 
		 * float=32
		 * double=64
		 * 
		 * 
		 * WHY WE NEED TYPE CASTIBG?
		 * -When we are working in teams we might need to convert data from different types. 
		 * When we are working with math some time we need to get rid of decimal part as we are only interested in the non-decimal part.
		 * 
		 * WHAT IS THE SYNTAX?
		 * Implicit/Narrowing/Manual
		 * 		int box = 1000;
		 * 		byte box2 = (byte)box;
		 * 
		 */
		
		//Explicit/Narrowing/Manual
		short largerBox = 129;
		byte smallerBox = (byte) largerBox;
		System.out.println(smallerBox);
		
		//Explicit/Narrowing/Manual
		int largerBox1=129;
		short smallerBox2 = (short) largerBox1;
		System.out.println(smallerBox2);
		
		//Implicit/widening/automatic
		short smallerBox3=45;
		long largerBox3=smallerBox3;
		System.out.println(smallerBox3);
		
	}

}

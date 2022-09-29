package com.syntax.class03;

public class TypeCasting {

	public static void main(String[] args) {
		
		/* Casting = converting/conversion
		 * 
		 * Casting types =>  
		 * converting one data type to another by using ()
		 * converting smaller box to larger box is called "implicit or widening or Automatic"
		 * converting larger box to smaller box is call "narrowing or explicit or Manual"
		 * 
		 */
		
		byte box1 = 127; //8 bits smallest data type box;
		short box2 =3333; // double the size of box1 in terms of bits 16bits
		int box3 = 555555; //32 bits
		long box4 = 777777777; //64 bits;
		
		float box5 = 41454647; // 4 bytes
		double box6 = 3.33333333333; //8 bytes
		
		
		
		int number = (int)15.2; // we cannot store the decimal number in a box of data type "int";
		System.out.println(number);
	
		long smallerBox = (long) box2;
		System.out.println(smallerBox);
		
		short biggerBox = box1;
		System.out.println(biggerBox);
		
		long box7 = box1; // we can fit box1 into "long" data type, "long" has larger space;
		
		float box8 = (float) box6; // as box6 is larger it's double we need to use "casting";
		System.out.println(box8); 
		
		char a = (char) 55;
		System.out.println(a);
		
		int box9 = (int) box4;
		System.out.println(box9);
		

	}

}

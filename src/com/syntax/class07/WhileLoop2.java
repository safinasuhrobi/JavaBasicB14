package com.syntax.class07;

public class WhileLoop2 {

	public static void main(String[] args) {
		
		
		// print all number from 1 to 10
		
		int num =1;
		
		while (num<=10) {
		
		System.out.println(num);
		num++;
		
		}
		
		System.out.println("------------------------");
		
		//
		int a=10;
		
		while (a<=25) {
			System.out.println(a + " ");
			a++;
			
		}
		
		System.out.println("-----------------------");
		
		// print all number from 10 to 1
		int b=10;
		
		while (b>=1) {
			System.out.println(b);
			b--;
		}
		
		// print all numbers form 50 to 20
		
		int c=50;
		 
		while (c>=20) {
			System.out.println(c);
			c--;
		}
		
		// print all even numbers from 1 to 20
		
		int d=1;
		
		while (d<=20) {
			
			if (d % 2==0) {
				System.out.println(d);
			}
			d++;
		}
		
		System.out.println("Another way to find even number for loop");
		
		int e = 2;
		
		while (e <=20) {
			System.out.println(c + " ");
			e +=2;
		}
		
	}
	
}
	

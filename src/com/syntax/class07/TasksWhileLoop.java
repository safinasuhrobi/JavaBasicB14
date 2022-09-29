package com.syntax.class07;

public class TasksWhileLoop {

	public static void main(String[] args) {
		
		//Task1-Print numbers from 100 to 1
		
		int a = 100;
		
		while (a>=1) {
			System.out.println(a);
			a--;
		}

		//Task2 -// Print even numbers from 20 to 100
		
		int b = 20;
		
		while (b>=20) {
			
			if (b%2==0) {
				System.out.println(b);
			}
			b++;
		}
		
		//Task3-print only odd numbers from 100 to 1 (2 different ways)
		
		int c = 100;
		
		while (c>=1) {
			
			if (c%2 !=0) {
				System.out.println(c);
			}
			c--;
		}
		
		System.out.println("----Another Way----");
		
		int d = 99;
		
		while (d >= 1) {
			System.out.println(d + " ");
			d-=2;
		}
		
	}

}

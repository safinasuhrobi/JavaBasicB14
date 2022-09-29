package com.syntax.class07;

public class ForLoopDemo {

	public static void main(String[] args) {
		
		//for (initianlization; condition; increment/decrement) { block of code }
		/*WHEN to use which loop?
		 * 
		 * When we know in advance how many times to repeat block of code --> use FOR LOOP
		 * 
		 * When we don't know in advance how many times to repeat block of code --> use WHILE or DO WHILE
		 * 
		 */
		
		for (int i=1; i<=5; i++) {
			
			System.out.println("Hello");
			
		}
		
		System.out.println("----------------------------");
		
		//EX: print numbers from 1 to 20

		for (int i=1; i<=20; i++) {
			
			System.out.println(i + " ");
		}
		
		System.out.println("-----------------------------");
		
		//EX: print numbers from 30 to 10
		
		for (int i=30; i>=10; i--) {
			
			System.out.println(i + " ");
		}
		
		System.out.println("-----------------------------");
		// what is the output?
		
		for (int i=0; i<=10; i+=2) {
			System.out.println(i+" ");
		}
		
		//what is the output?
		
		for (int i=10; i<=25; i+=5) {
			System.out.println(i + " ");
		}
		
		System.out.println("--------------------------------");
		//what is the output?
		
		int sum = 0;
		
		for (int i=1; i<=6; i++) {
			sum+=i;
			
		}
		System.out.println(sum);
	}

}

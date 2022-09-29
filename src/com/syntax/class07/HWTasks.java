package com.syntax.class07;

public class HWTasks {

	public static void main(String[] args) {
		
		//Task1-Print numbers from 1 to 100 in 1 line with space
		
		int numA = 1;
		
		while (numA<=100) {
			System.out.print(numA + " ");
			numA++;
		}
		
		//Task2-Print numbers from 100 to 1
		
		int numB = 100;
		
		while (numB>=1) {
			System.out.println(numB);
			numB--;
		}
		
		//Task3-Print even numbers from 20 to 1 (2 ways)
		
		
		int numC = 20;
		
		while (numC>=1) {
			
			if (numC % 2==0) {
				System.out.println(numC);
			}
			numC--;
		}
		
		//Another Way
		
		int numD = 20;
		
		while (numD >=1) {
			System.out.println(numD + " ");
			numD -=2;
		}
		
		//Task4-Print odd numbers between 20 and 50 (2 ways)
		
		int a = 20;
		
		while (a <=50) {
			if (a % 2 !=0) {
				System.out.println(a);
			}
			a++;
		}
		
		//Another Way
		
		int b = 21;
		
		while (b <= 49) {
			System.out.println(b + " ");
			b+=2;
		}
		
	}

}

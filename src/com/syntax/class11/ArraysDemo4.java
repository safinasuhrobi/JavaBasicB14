package com.syntax.class11;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDemo4 {

	public static void main(String[] args) {
		
		//The price of the individual dress
		//And the total of those prices
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Please enter the number of dresses you want to purchase");
		
		int numberOfDresses = scanner.nextInt();
		
		double [] prices = new double [numberOfDresses];
		
		for (int i=0; i < numberOfDresses; i++) {
			System.out.println("Please enter the price of dress number " + (i+1));
			prices[i] = scanner.nextDouble();
			
		}
		System.out.println(Arrays.toString(prices));
		
		double sum = 0;
		for (double cost:prices) {
			sum+=cost;
			
		}
		System.out.println("Total price for all dresses are " + sum);
	}

}

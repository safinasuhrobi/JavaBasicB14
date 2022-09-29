package com.syntax.class10;

import java.util.Scanner;

public class ProjectTask2 {

	public static void main(String[] args) {
		
		//Using Scanner create an array of countries. When an array is created, retrieve all values from it and while retrieving those values print capital for each country. (use 2 different loops).
		
		Scanner scanner = new Scanner (System.in);

		String[] country = new String[5];
		
		for (int i=0; i< country.length; i++) {
			System.out.println("Please enter the country");
			country[i] = scanner.nextLine();
			
			if(country[i].equals("Tajikistan")) {
				System.out.println("The capital of Tajikistan is Dushanbe");
			} else if (country[i].equals("USA")) {
				System.out.println("The capital of the USA is Washington DC");
			} else if (country[i].equals("Russia")) {
				System.out.println("The capital of Russia is Moscow");
			} else if (country[i].equals("England")) {
				System.out.println("The capital of England is London");
			} else if (country[i].equals("Japan")) {
				System.out.println("The capital of Japan is Tokyo");
			}
			
			System.out.println("----------------------------------");
				
		}
	

	}

}

package com.syntax.class04;

import java.util.Scanner;

public class HWCityAndTemperature {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner (System.in);
		 
		 System.out.println("What is the temperature?");
		 double temperatureF = scanner.nextDouble();
		 
		 System.out.println("What city?");
		 String cityName = scanner.next();
		 
		 double temperatureC = (temperatureF - 32) * 0.555555555555555555556;
		 
		 System.out.println("The temperature in the city is " + temperatureC);
		 
	}

}

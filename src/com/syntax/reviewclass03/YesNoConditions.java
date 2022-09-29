package com.syntax.reviewclass03;

import java.util.Scanner;

public class YesNoConditions {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		String batch14 = scanner.nextLine();
		
		if(batch14.equals("yes")) {
			System.out.println("You are amazing");
		}else {
			System.out.println("You are good");
		}

	}

}

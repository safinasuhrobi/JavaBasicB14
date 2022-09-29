package com.syntax.class05;

import java.util.Scanner;

public class AssignmentHeight {

	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Please eneter your height");
		 int height = scanner.nextInt();
		 
		 if (height <= 60) {
			 System.out.println("short");
		 } else if (height > 60 && height < 72) {
		 System.out.println("medium");
		 } else if (height > 72 );
		 System.out.println("tall");
	}
	
}


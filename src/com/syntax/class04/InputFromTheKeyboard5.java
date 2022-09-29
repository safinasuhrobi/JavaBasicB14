package com.syntax.class04;

import java.util.Scanner;

public class InputFromTheKeyboard5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Did you solve any Repl Assignment?"); //enter True or False under console
		boolean solvedAnyRepls=scanner.nextBoolean();
		
		if (solvedAnyRepls) {
			
			System.out.println("How many repls you solves?");
			int noReplsSolved=scanner.nextInt();
			
			if(noReplsSolved>=17) {
				
				System.out.println("You are doing great");
			} else if (noReplsSolved>10 ){
				System.out.println("you are doing OK, you should solve some more repls");
			}else {
				System.out.println("You should solve more repls. They are very important for your knowledge");
			}
			
		}else {
			System.out.println("They are very important to learn java to solve them");
		}
	}

}

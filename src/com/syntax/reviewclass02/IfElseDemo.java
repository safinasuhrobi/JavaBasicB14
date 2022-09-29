package com.syntax.reviewclass02;

public class IfElseDemo {

	public static void main(String[] args) {
		
		/*
		 * When we have to check if a box contains a value or not
		 * we can use "==" / "equals()"
		 * when the data type if primitive we use "==" like char, int, short, etc
		 * when the data types are non-primitive like String we use ".equals()"
		 * 
		 */
		String userName = "Admin";
		String password = "pass";
		if (password.equals ("pass123")) {
			System.out.println("Welcome " + userName);
		}else {
			System.out.println("Wrong password " + userName);
		} 

		
		
	}

}

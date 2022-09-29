package com.syntax.class11;

public class Array2DDemo1 {

	public static void main(String[] args) {
		
		String[] studentInRoom1 = new String[] {"Sabej", "Shah", "Mina"};
		String[] studentInRoom2 = new String[] {"Roman", "Shah", "Mina"};
		String[] studentInRoom3 = new String[] {"Asad", "Priyasri", "Ali"};
		//2D array that will store 3 single D arrays
		String[][] rooms = new String [3][];
		rooms[0]= studentInRoom1;
		rooms[1]= studentInRoom2;
		rooms[2]= studentInRoom3;
		
		System.out.println(rooms[1][2]);
	}
}

package com.syntax.class09;

public class TaskArray {

	public static void main(String[] args) {
		
		//Create an array of chars and store grades into it: A,B,C,D,E,F. Then print a grade B (use 2 different ways of creating an array).
		
		char[] letters = new char[6];
		
		letters[0]='A';
		letters[1]='B';
		letters[2]='C';
		letters[3]='D';
		letters[4]='E';
		letters[5]='F';
		
		System.out.println(letters[1]);
		
		System.out.println("----------2nd way--------------");
		
		
		char[] letters1 = {'A', 'B', 'C', 'D', 'E', 'F'};
		
		System.out.println(letters1[1]);

		//Create an array of names and store all names of your group. Then print your name from that array. (use 2 different ways of creating an array).
		
		String[] names = new String [5];
		
		names[0]="Lamis";
		names[1]="Madina";
		names[2]="Safina";
		names[3]="Jamol";
		names[4]="Sherveen";
		
		System.out.println(names[2]);
		
		System.out.println("--------------2nd way----------------");
		
		String[] names1 = {"Lamis", "Madina", "Safina", "Jamol", "Sherveen"};
		
		System.out.println(names1[2]);
		

		//Create an array of words: Java, Saturday, day, coding, is. Print the following sentence using elements of array: “Saturday is Java coding Day”.
		
		String[] words = new String[5];
		
		words[0] = "Java";
		words[1] = "Saturday";
		words[2] = "Day";
		words[3] = "coding";
		words[4] = "is";
		
		System.out.println(words[1] +" "+ words[4] + " "+ words[0] + " "+ words[3]+ " " + words [2]);
		
		System.out.println("---------------2nd way------------------");
		
		String[] words1 = {"Java", "Saturday", "Day", "coding", "is"};
		
		System.out.println(words[1] +" "+ words[4] + " "+ words[0] + " "+ words[3]+ " " + words [2]);
		
	}

}

package com.syntax.class12;

public class Student {

		String name;
		String id;
		int age;
		double weight;
		char gender;
		
	
		void study() {
			System.out.println("Student is studying");
		}
		
		void deleteMessages() {
			System.out.println("Deleting messages from Discord");
		}
		
		void eat() {
			System.out.println("Eating pizza...");
		}
		
		public static void main (String [] args) {
			
			Student object = new Student();
			// new Student()	-> creates the object of student class		
			object.name = "Jamol";
			object.id = "123";
			object.age = 26;
			object.weight = 150;
			object.gender = 'M';
			
			System.out.println(object.name);
			System.out.println(object.id);
			System.out.println(object.age);
			System.out.println(object.weight);
			object.deleteMessages();
			
			System.out.println("***************************");
			
			Student student2 = new Student();
			student2.name = "Asma";
			student2.age = 16;
			student2.weight = 30;
			student2.gender = 'F';
			System.out.println(student2.name);
			student2.eat();
			
			
		}
}

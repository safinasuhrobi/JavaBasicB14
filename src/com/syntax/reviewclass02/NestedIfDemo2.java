package com.syntax.reviewclass02;

public class NestedIfDemo2 {

	public static void main(String[] args) {


		boolean studyHard = true;
		
		if (studyHard) {
			System.out.println("We get the job in first few weeks");
			
			boolean goodCommunicationSkills = true;
			
			if (goodCommunicationSkills) {
				System.out.println("We might get a job in Appple or Amazon");
			} else {
				System.out.println("We need to work on communication skills");
			}
			
		} else {
			System.out.println("We might take a little longer to get the job");
		}
	}

}

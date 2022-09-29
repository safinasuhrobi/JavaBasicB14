package com.syntax.class08;

public class HWDigitalClock {

	public static void main(String[] args) {

		for (int h = 0; h <= 23; h++) {

			for (int m = 0; m <= 59; m++) {

				if (h < 10) {

					if (m < 10) {

						System.out.println("0" + h + ":0" + m);
					} else {
						System.out.println("0" + h + ":" + m);
					}
				} else {

					if (m < 10) {

						System.out.println(h + ":0" + m);
						
						
					} else {
						System.out.println( h + ":" + m);
					}
				}
			}

		}
		
		System.out.println("------Another Way------");
		
		String time = null;
		
		for (int hh = 0; hh <= 23; hh++) {

			for (int mm = 0; mm <= 59; mm++) {
				
				if (hh>10 && mm<10) {
					
					time = "0"+ hh + ":" + "0" +mm;
					
				} else if (hh<10 && mm>=10) {
					
					time = "0" + hh + ":" +mm;
					
				} else if (hh>=10 && mm<10) {
					
					time = hh + ":" + "0" + mm;
					
				} else {
					
					time = hh+":"+mm;
				}
				
				System.out.println(time);
			} 
			
		}
	}
}
package com.syntax.class14;

import java.util.Arrays;

public class SubstringMethod {

	public static void main(String[] args) {
		
		String str = "Today is Sunday";
		String str2 = new String("Today is Sunday");
		String day = str.substring(9);
		
		System.out.println(day);
		System.out.println(str.substring(6,8));
		
		char c=str.charAt(4); //calling the method charAt on str object
		System.out.println(str.charAt(4)); //=y

		char[] charArr = str.toCharArray();
		System.out.println(charArr); //proper way
		//System.out.println(Arrays.toString(charArr));
		
		int index = str.indexOf("a");
		System.out.println(index); //=3
		System.out.println(str.indexOf("a", 6)); //index of the second "a"
		
	}

}

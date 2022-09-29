package ProjectPart1;

public class Task6SWAP {

	public static void main(String[] args) {
		
		//Write a program to SWAP 2 numbers without a TEMPORARY variable;
		
		int a = 10;
		int b = 20;
		
		a = a+b; //10+20=30
		b = a-b; //30-20=10
		a = a-b;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		

	}

}

package ProjectPart1;

public class Task07 {

	public static void main(String[] args) {
		
		// Write a java program to check whether a given number is prime or not?
		
		int numX = 9;
		
		boolean isPrime = true;
		if (numX>1) {
			
			for (int i=2; i<numX; i++) {
				if (numX%i==0) {
					isPrime = false;
					break;
				}
			}
			
		} else {
			isPrime = false;
		}
		
		if (isPrime) {
			System.out.println(numX + " is Prime");
		} else {
			System.out.println(numX + " is not Prime");
		}
	}

}

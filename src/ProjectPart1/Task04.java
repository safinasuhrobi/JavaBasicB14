package ProjectPart1;

public class Task04 {

	public static void main (String[] args) {
		
		// 4. Create a 2D array or integer type where you will store odd and even numbers. Develop a program which will identify/print the even numbers only.

		int[][] arr = {
				
				{10, 10, 10, 20}, {25, 30, 54}, {20, 30}
		};
		
		for (int [] array:arr) {
			
			for (int num:array) {
				if(num%2==0) {
					System.out.println(num);
					
			}
		}
		
	}
	
}
}
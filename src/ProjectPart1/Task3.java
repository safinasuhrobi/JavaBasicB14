package ProjectPart1;

public class Task3 {

	public static void main(String[] args) {
		
		//Create a 2D array of interger values. Print the sum of all numbers.
		
		
		int[][] arr = {
				
				{10, 10, 10, 20},
				{25, 30, 54},
				{20, 30}
		};
		int sum =0;
		
		for (int [] array:arr) {
			
			for (int num:array) {
				
				sum+=num;
			}
		}
		System.out.println(sum);
	}

}

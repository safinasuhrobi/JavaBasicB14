package ProjectPart1;

public class Task5 {

	public static void main(String[] args) {
		
		//5. Create a 2D array of integers. Develop a program which will calculate the sum of even and odd numbers for that array
		
		int arr[][]= {
                {10,6,4,9},
                {3,1,8,2}
        };

        int sumOdd=0;
        int sumEven=0;

        for (int[] row:arr) {
            for(int num:row) {
                if(num%2==0) {
                    sumEven+=num;

                }else {
                    sumOdd+=num;

                }
            }
        }

        System.out.println(sumOdd);
        System.out.println(sumEven);
		
	}

}

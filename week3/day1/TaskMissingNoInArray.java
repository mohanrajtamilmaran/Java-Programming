package week3.day1;

public class TaskMissingNoInArray {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 5, 1, 6 };

		int n = arr.length + 1;// n=6;
		// As we want to add the missing number we increment array length +1;

		int res = n * (n + 1) / 2;
		// res=6*(6+1)/2; 6*6+1/2
		// res=6*7/2;	  6*7/2
		// res=42/2;      42/2;
		// res=21;        21

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			// 0 1 2 3 4 5
			sum = sum + arr[i];
			// sum=0+2;    sum= 0+2;
			// sum=2+4;    2+4=6;
			// sum=6+5;    6+5=11;
			// sum=11+1;	11+1=12;
			// sum=12+6;	12+3=15;
			// sum=18;     sum=15    21-15
		}
		int missingNumber = res - sum;
		// 21-18;=3

		System.out.println("Missing number from array arr: " + missingNumber);

	}

}

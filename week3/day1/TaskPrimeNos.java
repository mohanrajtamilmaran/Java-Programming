package week3.day1;

public class TaskPrimeNos {

	public static void main(String[] args) {
		int num = 24;
		if (num <= 1)
		{
			System.out.println("false");
		}

		else if ((num % 2) != 0) 
		{
			System.out.println(num + " is a prime number");
		} 
		else 
		{
			System.out.println(num + " is a non-prime number");
		}
	}
}

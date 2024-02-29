package week2.day3;

public class SumOfDigits
{
	public static void main(String[] args) 
	{
		int num = 535, sum = 0; 
		int rev=0;
        int ans=rev;
		while (num != 0) 
		{
			int i = num % 10;
			rev=rev*10+i;
			sum = sum + i;
			num = num / 10; 
		//	System.out.println( sum);
		}
		

		System.out.println("The sum of digits is " +sum);	
		System.out.print("The reverse of digit is"+rev);
}
}
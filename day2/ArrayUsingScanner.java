package week2.day2;

import java.util.Scanner;

public class ArrayUsingScanner
{
	
	public static void main(String[] args) 
	
	{
		int num;
		
		Scanner arr = new Scanner(System.in);
		
		System.out.println("Enter the size");
		
		num = arr.nextInt();
		
		int sum[];
		
		sum = new int[num];

		System.out.println("Enter the numbers :");

		for (int i = 0; i < num; i++)
		{
			sum[i] = arr.nextInt();
		}
		System.out.print("The elements in th array are: ");
		for (int i = 0; i < num; i++)
		{
			System.out.println(sum[i]);
		}
		System.out.println("The Array length is"+sum.length);
	}
}

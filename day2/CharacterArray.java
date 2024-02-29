package week2.day2;

import java.util.Scanner;

public class CharacterArray 
{
	public static void main(String[] args) 
	
	{
		
		Scanner al = new Scanner(System.in);
		
		int num;
		
		System.out.println("Enter the number of Names to be printed");
		
		num = al.nextInt();

		String arr[];
		
		arr = new String[num];
		
		System.out.println("Enter the name:");

		for (int i = 0; i <num; i++) 
		{
			arr[i] = al.nextLine();
		}
		for (int i = 0; i <num; i++)
		{
			System.out.println(arr[i]);
		}
      System.out.println(arr.length);
	}
}

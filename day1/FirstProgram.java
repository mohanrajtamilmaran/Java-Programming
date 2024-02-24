package week1.day1;

import java.util.Scanner;

public class FirstProgram {
	public static void main(String[] args) {

		System.out.println("My First Program 5466@");
		Scanner ne = new Scanner(System.in);
		 System.out.println("Enter any number");
		int num = ne.nextInt();
		System.out.println("You entered " + num);
		System.out.println("Enter your Name:");
		String name = ne.nextLine();
		System.out.println("You Entered name is: " + name);
	}
}

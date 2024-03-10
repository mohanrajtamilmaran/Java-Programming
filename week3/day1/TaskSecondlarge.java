package week3.day1;

import java.util.Arrays;

public class TaskSecondlarge {

	public static void main(String[] args) {
		int[] array = { 2, 3, 45, 66, 78, 99, 44, 56, 77 };

		Arrays.sort(array);

		// to sort the array in accending order;

		for (int i = 0; i < array.length; i++)
		// 0 1 2 3 4 5 6 7 8 9
		{
		System.out.print(" " + array[i]);
		}

		int second = array[array.length - 2];
		System.out.println("The second largest number is:" + second);

	}
}

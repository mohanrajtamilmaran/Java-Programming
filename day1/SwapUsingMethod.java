package week2.day1;

public class SwapUsingMethod {
	public int swappingNumbersWithoutTemp(int a, int b) {
		System.out.println("The Number Before Swapping :");
		System.out.println("A = " + a);
		System.out.println("B = " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("The Number after Swapping :");
		System.out.println("A = " + a);
		System.out.println("B = " + b);
		return a;

	}

	public int swappingNumbersWithTemp(int a, int b) {
		System.out.println("The Number Before Swapping :");
		System.out.println("A = " + a);
		System.out.println("B = " + b);
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("The Number after Swapping :");
		System.out.println("A = " + a);
		System.out.println("B = " + b);
		return a;

	}

	public static void main(String[] args) {
		SwapUsingMethod swap = new SwapUsingMethod();
		swap.swappingNumbersWithoutTemp(34, 44);
		swap.swappingNumbersWithTemp(45, 56);
	}

}

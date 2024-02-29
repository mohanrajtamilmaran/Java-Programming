package week2.day2;

public class PostiveOrNegativeNumbersUsingMethod {

	public void positiveOrNegative(int num1, int num2) {
		if (num1 > 0) {
			System.out.println("The Num1 is Positive");
		} else {
			System.out.println("The Num1 is Negative");
		}
		if (num2 > 0) {
			System.out.println("The Num2 is Positive");
		} else {
			System.out.println("The Num2 is Negative");
		}
	}

	public static void main(String[] args) {
		PostiveOrNegativeNumbersUsingMethod pn = new PostiveOrNegativeNumbersUsingMethod();
		pn.positiveOrNegative(20, -34);
	}
}

package week2.day1;

public class SwappingTwoNumbers {

	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		int temp;
		System.out.println("The previous A value:" + a);
		System.out.println("The previous B value:" + b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("The Updated A value is:" + a);
		System.out.println("The Updated B value:" + b);
	}
}

package week2.day1;

public class SwapWithOutTemp {
	public static void main(String[] args) {
		int a = 50;
		int b = 100;
		b = b - a;// b=100-50 b=50
		a = a + b;// a=50+50 a=100
		System.out.println(a);
		System.out.println(b);
	}
}

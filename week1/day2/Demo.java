package week1.day2;

public class Demo {
	public int calculator(int a, int b) {
		int c;
//		c = a + b;
//		c = a - b;
//		c = a * b;
//		c = a / b;
		c = a % b;
		return c;
	}

	public static void main(String[] args) {

		Demo in = new Demo();
		System.out.println("The calculator operation is" +in.calculator(234, 10));
	}
}

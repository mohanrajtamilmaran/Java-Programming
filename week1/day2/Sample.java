package week1.day2;

public class Sample {
	int a= 5;
	int b=10;
	public int addition() {
		int c;
		System.out.println(c = a + b);
		return c;
	}

	public int subraction() {
		int c;
		System.out.println(c = a - b);
		return c;
	}

	public int multiplication() {
		int c;
		System.out.println(c = a * b);
		return c;
	}

	public int division() {
		int c;
		System.out.println(c = a / b);
		return c;
	}

	public int modulus() {
		int c;
		System.out.println(c = a % b);
		return c;
	}

	public static void main(String[] args) {
		Sample old = new Sample();
//		System.out.println("Addition of two numbers:" + old.addition(3, 5));
//		System.out.println("Subraction of two numbers:" + old.subraction(4, 6));
//		System.out.println("Multiplication of two numbers:" + old.multiplication(4, 6));
//		System.out.println("Division of two numbers:" + old.division(20, 4));
//		System.out.println("Modulus of two numbers:" + old.modulus(167, 10));
		System.out.println(old.addition());
		System.out.println(old.subraction());
		System.out.println(old.multiplication());
		System.out.println(old.division());
		System.out.println(old.modulus());
	}
}

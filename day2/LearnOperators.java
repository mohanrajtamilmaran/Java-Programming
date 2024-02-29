package week2.day2;

public class LearnOperators {
	public static void main(String[] args) {
		int age = 18;
		int num = 5;
		if (num == 5) {
			System.out.println("Number is ==5");
		} else {
			System.out.println("Number is!=5");
		}
		if (num != 5) {
			System.out.println("Number is Satisfied");
		} else {
			System.out.println("Given Number is not Satisfied");
		}
		if (age >= 18) {
			System.out.println("Eligible to Vote");

		} else {
			System.out.println("Not Eligible");

		}
		System.out.println(age + num);
		System.out.println(++age);// pre increment
		System.out.println(age++);// post increment
		System.out.println(--age);// pre decrement
		System.out.println(age--);// post increment
	}

}

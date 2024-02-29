package week2.day2;

public class OddNumbers {

	public static void main(String[] args) {
		int c = 0;
		for (int i = 0; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.print(" ");
				System.out.print(i);
			}
			c=i;
		}
	
		System.out.println(" i value :" + c);

	}
}

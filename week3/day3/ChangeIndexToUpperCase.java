package week3.day3;

public class ChangeIndexToUpperCase {
	public static void main(String[] args) {
		String name = "Changeme";

		String upper = "";

		char[] charArray = name.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			char a = charArray[i];

			if (i % 2 == 0) {
				
				
				upper = upper + Character.toUpperCase(a);
			} else {
				upper = upper + charArray[i];
			}
		}
		System.out.println(upper);
	}

}



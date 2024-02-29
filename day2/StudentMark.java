package week2.day2;

public class StudentMark {
	public void passOrFail(int mark) {
		if (mark >= 90) {
			System.out.println("A");
		} else if (mark >= 50) {
			System.out.println("B");
		} else if (mark >= 35) {

			System.out.println("C");
		} else {
			System.out.println("RA");
		}
	}

	public static void main(String[] args) {
		StudentMark mark = new StudentMark();
		mark.passOrFail(94);
	}

}

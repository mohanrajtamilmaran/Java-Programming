package week1.day2;

public class StudentReport {
	String studentName = "mohan";
	int studentId = 420;
	char initial = 'T';
	boolean regularStudent = false;
	int phoneNumber = 866762873;
	float cgp = 8.03f;
	double overallPercentage = 833.343;

	public int studentMark(int age,int roll) {
		System.out.println( age);
		System.out.println(roll);
		System.out.println(regularStudent);
		System.out.println(cgp);
		System.out.println(phoneNumber);
		return age;
	}

	public static void main(String[] args) {

		StudentReport stu = new StudentReport();
		System.out.println(stu.cgp);
		System.out.println(stu.initial);
		stu.studentMark(5, 8);
	}
}

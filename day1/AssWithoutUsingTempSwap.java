package week2.day1;

public class AssWithoutUsingTempSwap {
	public static void main(String[] args) {

		int a = 20;
		int b = 80;
		a=a+b;//80+20=100 
		b=a-b;//100-80=20
		a=a-b;//100-20
		System.out.println(a);
		System.out.println(b);
	}

}

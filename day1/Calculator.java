package week2.day1;

public class Calculator {
	int d = 30;
	int f =20;

	public int addition() {
		int a = 10;
		int b = 20;
		int c;
		System.out.println(c=a+b);
		return c;
	}

	public int sub() {
		 int c;
		System.out.println(c = d-f);
		return c;
		
	}

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.sub();
		cal.addition();
		PublicAccessModifier acc=new PublicAccessModifier();
		acc.protectedAccessModifier();
		acc.defaultAccessModifier();
		acc.publicaccessLevel();
	
	}
}

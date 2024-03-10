package week1.day2;

import week2.day1.PublicAccessModifier;

public class Calculator {
	public int add(int a, int b) {
		System.out.println(a + b);
		return a + b;
	}

	public int sub(int a, int b) {
		System.out.println(a - b);
		return a - b;
	}

	public int mul(int a, int b) {
	//	System.out.println(a * b);
		return a * b;
	}

	public int div(int a, int b) {
		//System.out.println(a / b);
		return a / b;
	}
	public int mod(int a,int b) {
   // System.out.println(a%b);
    return a%b;
	}

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.add(32, 43);
		cal.sub(34, 23);
		cal.mul(4, 8);
		cal.div(64, 8);
		cal.mod(100, 10);
		PublicAccessModifier acc = new PublicAccessModifier();
		acc.publicaccessLevel();
		

	}
}

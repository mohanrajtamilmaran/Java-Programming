package week1.day1;

import week2.day1.PublicAccessModifier;

public class Car {
	public void soundHorn() {
		System.out.println("Sound Horn");

	}

	public void applyBrake() {
		System.out.println("Applying break");

	}

	public void accelerate() {
		System.out.println("Accelerate");

	}

	public static void main(String[] args) {
		Car objNam = new Car();
		objNam.accelerate();
		objNam.applyBrake();
		objNam.soundHorn();
		PublicAccessModifier acc = new PublicAccessModifier();
	}
}

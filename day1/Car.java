package week1.day1;

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

	}
}

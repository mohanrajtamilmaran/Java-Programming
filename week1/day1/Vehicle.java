package week1.day1;

public class Vehicle {
	public void electric() {
		System.out.println("No pollutoin");
	}

	public void diesel() {
		System.out.println("More pollutoin and less milage");
	}

	public void gear() {
		System.out.println("Manual gear");
	}

	public static void main(String[] args) {
		Vehicle call = new Vehicle();
		call.diesel();
		call.electric();
	}

}

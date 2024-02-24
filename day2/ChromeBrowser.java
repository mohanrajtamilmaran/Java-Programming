package week1.day2;

public class ChromeBrowser {
	String browserName = "Chrome Firefox";
	int rollNo = 8;

	public  String incognoto(String browserName,int rollNo) {
		System.out.println(browserName);
		System.out.println(rollNo);
		return browserName;
	}

	public static void main(String[] args) {
		ChromeBrowser cb = new ChromeBrowser();
		System.out.println(cb.browserName);
		System.out.println(cb.rollNo);
		System.out.println("Chrome");
		cb.incognoto("hi", 8);

	}
}

package week3.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mohan");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("89&*");
		driver.findElement(By.xpath("//button[@name='login']")).click();

	}

}

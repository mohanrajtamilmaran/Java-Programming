package week3.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.className("Pke_EE"));
		
		search.sendKeys("1+nord CE3 lite mobile phones");
		search.sendKeys(Keys.ENTER);
	}

}

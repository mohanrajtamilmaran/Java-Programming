package week3.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JioMart {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("search")).sendKeys("Marvel KeyChains");
	   
	    
	}

}

package week3.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTaps {
public static void main(String[] args) {
	ChromeDriver driver =new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	// driver.findElement(By.linkText("CRM/SFA")).click();
	 // driver.findElement(By.partialLinkText("CRM")).click();
	driver.findElement(By.tagName("a")).click();
	  
}
}

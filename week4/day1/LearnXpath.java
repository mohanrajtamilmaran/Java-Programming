package week4.day1;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {
	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main ");
	 //   WebElement findElement = driver.findElement(By.tagName("a"));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/S')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();

		
		
		// Syntax for x path
		//1. Attribute Based Xpath
		
		//   //tagName[@attributeName='attributeValue']
		
		//2. Index based Xpath
		
		// (//tagName[@attributeName='attributeValue'])[index value]
		
		//3. Text based Xpath
		
		 // tagName[text()='textValue']
		
		//4. Contains based Xpath
		
		// tagName[contains(@attributeName,'attributrValue')]
	}

}

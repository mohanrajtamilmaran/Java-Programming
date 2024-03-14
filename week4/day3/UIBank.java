package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UIBank {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://uibank.uipath.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement registerButton = driver.findElement(By.xpath("//small[text()='Register For Account']"));
		driver.executeScript("arguments[0].click();",registerButton);
		driver.findElement(By.id("firstName")).sendKeys("Mohan");
		driver.findElement(By.id("lastName")).sendKeys("Raj");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mohanrajtamilmaran@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("#mohan007");
		driver.findElement(By.xpath("//div[@class='col-md-6 uipath-group']/input[@id='middleName']")).sendKeys("T");
		driver.findElement(By.xpath("//label[@class='uibank-label']/following-sibling::select[@id='sex']")).sendKeys("Male");
		driver.findElement(By.xpath("//input[@id='age']")).sendKeys("07/09/2002");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("MohanmaranRaj");
	}

}
package week3.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Login {
	public static void main(String[] args)
	{
		//EdgeDriver driver=new EdgeDriver();
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		
		//driver.manage().window().maximize();
		driver1.get("https://www.google.co.in/");
		driver1.findElement(By.id("APjFqb")).sendKeys("Thambaram railway station");
		driver1.findElement(By.className("//input[@id='email']")).click();
		
//	driver.get("http://leaftaps.com/opentaps/control/login");
//		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
//		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
//		driver.findElement(By.className("decorativeSubmit")).click();
//		
		
	}

}
 
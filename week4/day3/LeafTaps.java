package week4.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTaps {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		String currentUrl2 = driver.getCurrentUrl();
		System.out.println(currentUrl2);
		driver.findElement(By.className("decorativeSubmit")).click();
		
		String currentUrl = driver.getCurrentUrl();
		
		  System.out.println(currentUrl);
		  
		  if(currentUrl.contains("login"))
		  {
			  System.out.println("Page is loaded successfully");
		  }
		  
	//	  driver.findElement(By.xpath("//a[contains(text()='CRM/S')]")).click();
		  
		  String title = driver.getTitle();
		  System.out.println(title);
		  if(title.contains("Platform"))
		  {
			  System.out.println("The Lead Page is Loaded Successfully");
		  }
		  driver.navigate().back();
		  Thread.sleep(3000);
		  driver.navigate().forward();
		  
		  
		  WebElement findElement = driver.findElement(By.xpath("//span[text()='Disabled']"));
		  boolean enabled = findElement.isEnabled();
		  if(enabled==false)
		  {
			  findElement.sendKeys("sdgfs");
			  findElement.clear();
			  findElement.click();
			  findElement.getText();
			  findElement.getTagName();
		  }
	}

}

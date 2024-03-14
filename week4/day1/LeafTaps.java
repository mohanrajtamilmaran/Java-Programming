package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTaps {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
	driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
	driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Mohan Raj");
	driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("T");
	driver.findElement(By.xpath("//input[@id='createLeadForm_birthDate']")).sendKeys("07/09/2002");
	driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Mohan");
	driver.findElement(By.xpath("//input[@id='createLeadForm_lastNameLocal']")).sendKeys("Raj");
	driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("mohanrajtamilmaran@gmail.com");
	driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']")).sendKeys("8667662873");
	driver.findElement(By.xpath("//input[@id='createLeadForm_generalToName']")).sendKeys("Mr.Mohan Raj.T");
	driver.findElement(By.xpath("//input[@id='createLeadForm_generalAddress1']")).sendKeys("184");
	driver.findElement(By.xpath("//input[@id='createLeadForm_generalAddress2']")).sendKeys("SEETHAKATHI STREET");
	driver.findElement(By.xpath("//input[@id='createLeadForm_generalCity']")).sendKeys("VIRUDHUNAGAR");
	driver.findElement(By.xpath("//input[@id='createLeadForm_generalPostalCode']")).sendKeys("626001");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	
	
	
}
}

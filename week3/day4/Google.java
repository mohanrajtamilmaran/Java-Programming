package week3.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
public static void main(String[] args) {
  ChromeDriver driver= new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://www.google.com/");
  driver.findElement(By.className("gLFyf")).sendKeys("IPL");
  driver.findElement(By.className("btnK")).click();
 
}
}

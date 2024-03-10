package week3.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=676742245123&hvpos=&hvnetw=g&hvrand=1155642612863152873&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061908&hvtargid=kwd-10573980&hydadcr=14453_2367553&gad_source=1 ");
    driver.manage().window().maximize();
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");
    driver.findElement(By.id("nav-search-submit-button")).click();
}
}

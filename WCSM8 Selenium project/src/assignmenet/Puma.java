package assignmenet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Puma {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
  		co.addArguments("--remote-allow-origins=*");
  		co.addArguments("--Disable-Notifications");
  	    WebDriver  driver = new ChromeDriver(co);
  	    driver.manage().window().maximize();
  	    Thread.sleep(2000);
  	   driver.get("https://in.puma.com/in/en");
  	    driver.findElement(By.xpath("//span[text()='PUMA.com']/ancestor::a/following-sibling::button/descendant::span[text()='Menu']")).click();    
	}

}

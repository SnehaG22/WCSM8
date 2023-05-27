package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NetflixId {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
  		co.addArguments("--remote-allow-origins=*");
  	    WebDriver  driver = new ChromeDriver(co);
  	    driver.manage().window().maximize();
  	    Thread.sleep(2000);
  	    driver.get("https://www.netflix.com/in/Login");
  	    Thread.sleep(2000);
  	    driver.findElement(By.id("id_userLoginId")).sendKeys("ssssssss");
  	    Thread.sleep(2000);
  	    driver.findElement(By.id("id_password")).sendKeys("123456");
  	    Thread.sleep(2000);
  	  
		
	}

}

package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CssSclector {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
  		co.addArguments("--remote-allow-origins=*");
  	    WebDriver  driver = new ChromeDriver(co);
  	    driver.manage().window().maximize();
  	    Thread.sleep(2000);
  	    driver.get("https://www.instagram.com/accounts/login/");
  	  Thread.sleep(2000);
  	  driver.findElement(By.name("username")).sendKeys("sneha__gadhave");
  	Thread.sleep(2000);
  	  driver.findElement(By.name("password")).sendKeys("123456788");
  	Thread.sleep(2000);
  	  driver.findElement(By.cssSelector("button[class='_acan _acap _acas _aj1-']")).click();
		
	}

}

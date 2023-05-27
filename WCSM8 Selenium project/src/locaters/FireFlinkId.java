package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FireFlinkId {
	public static void main(String[] args) throws InterruptedException {
  		//ChromeOptions co = new ChromeOptions();
  		//co.addArguments("--remote-allow-origins=*");
  	    WebDriver  driver = new ChromeDriver();
  	    driver.manage().window().maximize();
  	    Thread.sleep(2000);
  	    driver.get("https://app.fireflink.com/signin");
  	    Thread.sleep(2000);
  	    driver.findElement(By.tagName("input")).sendKeys("manager");
  	    driver.findElement(By.id("mui-2")).click();
  	
	}

}

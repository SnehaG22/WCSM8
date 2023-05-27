package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XPath {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
  		co.addArguments("--remote-allow-origins=*");
  	    WebDriver  driver = new ChromeDriver(co);
  	    driver.manage().window().maximize();
  	    Thread.sleep(2000);
  	    driver.get("https://www.instagram.com/");
  	    Thread.sleep(2000);
  	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("sneha_gadave");
  	    
	}

}

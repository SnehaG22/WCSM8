package assignmenet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignmet1 {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
  		co.addArguments("--remote-allow-origins=*");
  	    WebDriver  driver = new ChromeDriver(co);
  	    driver.manage().window().maximize();
  	    Thread.sleep(2000);
  	    driver.get("https://accounts.snapchat.com/accounts/login?client_id=ads-api&referrer=https%25253A%25252F%25252Fads.snapchat.com%25252Fsetup");
  	  Thread.sleep(2000);
  	  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("ghsdjdhediuwhid");
  	  Thread.sleep(2000);
  	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("jenfhksdjkkd");
  	  driver.findElement(By.xpath("//button[@class='btn btn-lg btn-primary']")).click();
	}

}

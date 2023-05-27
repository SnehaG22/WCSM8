package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AirIndia {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
  		co.addArguments("--remote-allow-origins=*");
  	    WebDriver  driver = new ChromeDriver(co);
  	    driver.manage().window().maximize();
  	    Thread.sleep(2000);
  	    driver.get("https://www.airindia.in/");
  	  Thread.sleep(2000);
  	  driver.findElement(By.xpath("//input[contains(@name,'from')]")).sendKeys("pune");
  	 Thread.sleep(2000);
  	  driver.findElement(By.xpath("//a[contains(text(),'Pune, Lohegaon Airport, PNQ, India, IN')]")).click();
  	  Thread.sleep(2000);
  	  driver.findElement(By.xpath("//input[contains(@name,'to')]")).sendKeys("mumbai");
  	Thread.sleep(2000);
  	driver.findElement(By.xpath("//a[contains(text(),'Mumbai, Chhatrapati Shivaji International Airport, BOM, India, IN')]")).click();
  	Thread.sleep(2000);
  	driver.findElement(By.xpath("//input[contains(@title,'Departing')]")).click();
  	Thread.sleep(2000);
  	driver.findElement(By.xpath("//a[contains(@class,'ui-state-default ui-state-highlight')]")).click();
  	Thread.sleep(2000);
  	driver.findElement(By.xpath("//input[contains(@title,'Returning')]")).click();
  	Thread.sleep(2000);
  	driver.findElement(By.xpath("//a[contains(@class,'ui-state-default ui-state-highlight')]")).click();
  	Thread.sleep(2000);
  	driver.findElement(By.xpath("//select[contains(@title,'Aged 12 and over')]")).click();
  	Thread.sleep(2000);
  	driver.findElement(By.xpath("//select[contains(@title,'Aged 2-11 years old')]")).clear();
	}

}

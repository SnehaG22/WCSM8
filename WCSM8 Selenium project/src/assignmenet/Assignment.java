package assignmenet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment {
    public static void main(String[] args) throws InterruptedException {
    	ChromeOptions co = new ChromeOptions();
  		co.addArguments("--remote-allow-origins=*");
  	    WebDriver  driver = new ChromeDriver(co);
  	    driver.manage().window().maximize();
  	    Thread.sleep(2000);
  	    //NETFLIX
  	    driver.get("https://www.netflix.com/in/Login");
  	  Thread.sleep(2000);
  	  driver.findElement(By.xpath("//input[@id='id_userLoginId']")).sendKeys("snegagadave@gmail.com");
  	Thread.sleep(2000);
  	driver.findElement(By.xpath("//input[@id='id_password']")).sendKeys("1234567890");
  	Thread.sleep(2000);
  	driver.findElement(By.xpath("//button[@class='btn login-button btn-submit btn-small']")).click();
  	Thread.sleep(2000);
  	
 //..........................................................................................................//
  	//FLIPCART
  	driver.navigate().back();
  	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("123456789");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
  	
  	    
	}
}

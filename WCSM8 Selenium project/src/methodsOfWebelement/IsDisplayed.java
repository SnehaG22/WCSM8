package methodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {
	public static void main(String[] args) {
		WebDriver  driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.netflix.com/in/Login");
		 WebElement us = driver.findElement(By.id("id_userLoginId"));
		 if(us.isDisplayed())
		 {
			 us.sendKeys("122435354");
		 }
		 else
		 {
			 System.out.println("Exception will occur");
		 }
		 
	}

}

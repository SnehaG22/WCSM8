package synchronaization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shoppersstack {
	public static void main(String[] args)  {
		WebDriver  driver = new ChromeDriver();
  	    driver.manage().window().maximize();
  	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
  	   
  	    driver.get("https://www.shoppersstack.com/");
  	    driver.findElement(By.xpath("//span[text()='Noise ColorFit Pulse Spo2 Smart Watch']")).click();
  	    driver.findElement(By.id("Check Delivery")).sendKeys("123456");
  	        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
  	        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("Check")))).click();
  	        //wait.until(ExpectedConditions.elementToBeClickable(By.name("Check"))).click();
  	    //driver.findElement(By.name("Check")).click();

	}

}

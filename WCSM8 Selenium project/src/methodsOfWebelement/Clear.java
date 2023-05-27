package methodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {
	public static void main(String[] args) {
		WebDriver  driver = new ChromeDriver();
  	    driver.manage().window().maximize();
  	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  	     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  	   
  	     WebElement ustb = driver.findElement(By.name("username"));
  	     ustb.sendKeys("admin");
  	     ustb.clear();
	}

}

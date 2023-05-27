package methodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click {
	public static void main(String[] args) {
		WebDriver  driver = new ChromeDriver();
  	    driver.manage().window().maximize();
  	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  	     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  	   
    driver.findElement(By.xpath("//button[text()=' Login ']")).click();
    driver.findElement(By.xpath("//p[text()='Forgot your password? ']")).click();
  	     
	}

}

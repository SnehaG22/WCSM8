package methodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {
	public static void main(String[] args) {
		WebDriver  driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.instagram.com/accounts/login/");
		 WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
		 boolean verify = button.isEnabled();
		 System.out.println(verify);
		 driver.findElement(By.name("username")).sendKeys("234567890");
		 driver.findElement(By.name("password")).sendKeys("234567890");
		 boolean ver = button.isEnabled();
		 System.out.println(ver);
		                  
	}

}

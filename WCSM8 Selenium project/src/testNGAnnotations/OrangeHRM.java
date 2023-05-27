package testNGAnnotations;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class OrangeHRM extends BaseTest{
	@Test
	public void logIn() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
	}
 
	  
  }


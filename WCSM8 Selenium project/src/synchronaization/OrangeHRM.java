package synchronaization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {
	public static void main(String[] args) {
		WebDriver  driver = new ChromeDriver();
  	    driver.manage().window().maximize();
  	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  	     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  	     if(driver.getTitle().equals("OrangeHRM"))
  	     {
  	    	 System.out.println("Test Case is pass");
  	    	 driver.findElement(By.name("username")).sendKeys("Admin");
  	    	 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
  	    	 driver.findElement(By.xpath("//button[@type='submit']")).click();
  	     }
  	    if(driver.getTitle().equals("OrangeHRM"))
  	    {
  	    	System.out.println("Test Case is pass");
  	    }
  	    else
  	    { System.out.println("Test Case is not pass");
  	    	
  	    }
  	     
	}

}

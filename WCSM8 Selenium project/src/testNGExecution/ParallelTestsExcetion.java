package testNGExecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTestsExcetion {
	static WebDriver driver;
	  @Test
	  @Parameters({"browser","url","userN","pass"})
	  public void SelectBrowser(String browser, String url,String userN,String pass) {
		  if(browser.equals("chrome"))
		  {
			  driver=new ChromeDriver();
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			  driver.get(url);
			  driver.findElement(By.name("username")).sendKeys(userN);
			  driver.findElement(By.name("password")).sendKeys(pass);
			  driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
			  
		  }
		  else if(browser.equals("firefox"))
		  {
			  driver=new FirefoxDriver();
			  
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			  driver.get(url);
			  driver.findElement(By.name("username")).sendKeys(userN);
			  driver.findElement(By.name("password")).sendKeys(pass);
			  driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
			  
		  }
		  
		  else {
			  System.out.println("Invalid browser..");
		  }
		  
	  }
}

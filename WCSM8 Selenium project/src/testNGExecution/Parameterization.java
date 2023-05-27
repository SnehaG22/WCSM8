package testNGExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Parameterization {
	static WebDriver driver;
  @Test
  @Parameters({"browser","url"})
  public void SelectBrowser(String browser, String url) {
	  if(browser.equals("chrome"))
	  {
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get(url);
	  }
	  else if(browser.equals("firefox"))
	  {
		  driver=new FirefoxDriver();
		  
		  driver.manage().window().maximize();
		  driver.get(url);
	  }
	  
	  else {
		  System.out.println("Invalid browser..");
	  }
	  
  }
}

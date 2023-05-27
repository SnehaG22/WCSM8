package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindElement {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
  		co.addArguments("--remote-allow-origins=*");
  	    WebDriver  driver = new ChromeDriver(co);
  	    driver.manage().window().maximize();
  	    Thread.sleep(2000);
  	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  	  Thread.sleep(2000);
  	    WebElement UsernaneTextFeild = driver.findElement(By.name("username"));
  	  Thread.sleep(2000);
  	  System.out.println(UsernaneTextFeild);
  	UsernaneTextFeild.sendKeys("Admin");
  	  
	}

}

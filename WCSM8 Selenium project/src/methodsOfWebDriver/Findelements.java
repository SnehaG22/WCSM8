package methodsOfWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Findelements {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
  		co.addArguments("--remote-allow-origins=*");
  	    WebDriver  driver = new ChromeDriver(co);
  	    driver.manage().window().maximize();
  	    Thread.sleep(2000);
  	    driver.get("https://www.google.com/");
  	    Thread.sleep(2000);
  	    driver.switchTo().activeElement().sendKeys("Poha");
  	  Thread.sleep(2000);
  	    List<WebElement> PohaOptions = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
  	  Thread.sleep(2000);
  	  for(int i=0;i<PohaOptions.size();i++)
  	  {
  		  String Poha = PohaOptions.get(i).getText();
  		  System.out.println(Poha);
  		Thread.sleep(2000);
  	
  	  }
  	  driver.quit();
  	  //for(WebElement Poha:PohaOptions)
  	  //{
  		 // System.out.println(Poha.getText()));
  		//Thread.sleep(2000);
  	  //}
  	    
	}

}

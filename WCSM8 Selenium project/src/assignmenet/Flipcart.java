package assignmenet;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipcart {
	public static WebElement waitM(WebDriver driver, int sec , String value)
    {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(sec));
    	WebElement element=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(value))));
    	return element;
 
    }
	 
	public static void main(String[] args) {
		ChromeOptions co = new ChromeOptions();
  		co.addArguments("--remote-allow-origins=*");
  	    WebDriver  driver = new ChromeDriver(co);
  	    driver.manage().window().maximize();
  	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
  	    driver.get("https://www.flipkart.com/");
  	   driver.findElement(By.xpath("//button[text()='✕']")).click();
  	    driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("hp laptop");
  	 
  	    driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
  	    waitM(driver,10,"//div[text()='Core i7']").click();
  	  // driver.findElement(By.xpath("//div[text()='Core i7']")).click();
  	    
  	    
	  waitM(driver,10,"//div[text()='Brand']").click();
   	//driver.findElement(By.xpath("//div[text()='Brand']")).click();
	   	 //driver.findElement(By.xpath("//div[text()='HP']")).click();
    	waitM(driver,30,"//div[text()='Operating System']").click();
    	
  	   // driver.findElement(By.xpath("//div[text()='Operating System'] ")).click();
  	    driver.findElement(By.xpath("//div[@class='_3879cV' and(text()='Windows 11')]")).click();
  	    driver.findElement(By.xpath("//div[text()='4★ & above']")).click();
  	    String firstsugestionprice = driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1'])[1]")).getText();
  	    System.out.println(firstsugestionprice);
  	    //driver.quit();
	}

}

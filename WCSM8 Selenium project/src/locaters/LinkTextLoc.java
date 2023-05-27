package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LinkTextLoc {
	public static void main(String[] args) throws InterruptedException {
		
	ChromeOptions co=new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(co);
	driver.manage().window().maximize();
	 driver.get("file:///C:/Users/Shweta%20Gadave/Desktop/WebElement/Link.html");
	 Thread.sleep(2000);
	 driver.findElement(By.linkText("InstagramLogin")).click();
	 Thread.sleep(2000);
	 driver.navigate().back();
	 Thread.sleep(2000);
	 driver.findElement(By.partialLinkText("Insta")).click();
	 
	 
	 
	 

	
	}

}

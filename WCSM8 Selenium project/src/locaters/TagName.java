package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TagName {
	public static void main(String[] args) throws InterruptedException {
		 ChromeOptions co = new ChromeOptions();
		 co.addArguments("--remote-allow-origins=*");
		 WebDriver driver=new ChromeDriver(co);
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.get("https://www.instagram.com/accounts/login/");
		 Thread.sleep(2000);
		 driver.findElement(By.tagName("input")).sendKeys("sneha__gadave");
		 
	}

}

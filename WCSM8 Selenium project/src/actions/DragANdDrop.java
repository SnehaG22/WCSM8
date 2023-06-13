package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragANdDrop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,350)");
		//---------------------------------------------------------------
		WebElement src1 = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement src2 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		
		WebElement src3 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement src4 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		//-------------------------------------------------------------------
		WebElement traget1 = driver.findElement(By.xpath("//li[@class='placeholder']/ancestor::ol[@id='bank']"));
		WebElement target2 = driver.findElement(By.xpath("//li[@class='placeholder']/ancestor::ol[@id='amt7']"));
		
		WebElement target3 = driver.findElement(By.xpath("//li[@class='placeholder']/ancestor::ol[@id='loan']"));
		WebElement target4 = driver.findElement(By.xpath("//li[@class='placeholder']/ancestor::ol[@id='amt8']"));
		
		//---------------------------------
		//to perform drag and drop
		Actions at = new Actions(driver);
		at.dragAndDrop(src1,traget1).perform();
		Thread.sleep(2000);
		at.dragAndDrop(src2, target2).perform();
		Thread.sleep(2000);
		at.dragAndDrop(src3, target3).perform();
		Thread.sleep(2000);
		at.dragAndDrop(src4, target4).perform();
		
	}

}

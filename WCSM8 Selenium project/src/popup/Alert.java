package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,300)");
	//SIMPLE alet
	driver.findElement(By.id("alertBox")).click();
	driver.switchTo().alert().accept();
	Thread.sleep(2000);
	//Confirmarion alert
	driver.findElement(By.id("confirmBox")).click();
	driver.switchTo().alert().accept();
	//Prompt alert
	Thread.sleep(2000);
	driver.findElement(By.id("promptBox")).click();
	org.openqa.selenium.Alert p = driver.switchTo().alert();
	p.sendKeys("hi");
	p.accept();
	
	
}

}

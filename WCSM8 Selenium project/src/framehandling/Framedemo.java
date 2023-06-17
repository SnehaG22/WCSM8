package framehandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Framedemo {
	public static void main(String[] args) {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,300)");
	driver.findElement(By.id("name")).sendKeys("hello");
	driver.switchTo().frame(driver.findElement(By.id("frm1")));
	WebElement element = driver.findElement(By.id("course"));
	Select dropdown=new Select(element);
	dropdown.selectByVisibleText("Java");
	driver.switchTo().defaultContent();
	driver.findElement(By.id("name")).sendKeys("bye");
	
	
			
	
	
	}

}

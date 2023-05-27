package methodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {
	public static void main(String[] args) {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
	Point loc = button.getLocation();
	int X = loc.getX();
	int Y = loc.getY();
	System.out.println("X axis  : "+X+"Y axis :"+Y);
	}

}

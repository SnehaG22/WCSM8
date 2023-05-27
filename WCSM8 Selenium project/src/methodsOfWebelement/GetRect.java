package methodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRect {
	public static void main(String[] args) {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
		Rectangle rect = button.getRect();
		int height = rect.getHeight();
		int width = rect.getWidth();
		System.out.println("HEIGHT :"+height+ "WIDTH :"+width);
		int X = rect.getX();
		int Y = rect.getY();
		System.out.println("X axis:"+X+ "Y axis:"+Y);
	}

}

package methodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {
public static void main(String[] args) {
	WebDriver  driver= new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.get("https://www.netflix.com/in/Login");
	 WebElement checkbox = driver.findElement(By.xpath("//span[text()='Remember me']"));
	 boolean var = checkbox.isSelected();
	 System.out.println(var);
}
}

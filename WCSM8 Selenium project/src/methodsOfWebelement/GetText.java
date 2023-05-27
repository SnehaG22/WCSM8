package methodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
	public static void main(String[] args) {
		WebDriver  driver = new ChromeDriver();
  	    driver.manage().window().maximize();
  	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  	     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  	   
     String button = driver.findElement(By.xpath("//button[text()=' Login ']")).getText();
    System.out.println(button);
	}

}

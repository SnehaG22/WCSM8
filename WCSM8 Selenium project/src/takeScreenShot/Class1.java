package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Class1 {
	public static void main(String[] args) throws IOException {
		
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.netflix.com/in/Login");
	
	driver.findElement(By.name("userLoginId")).sendKeys("ghjgkjhljgjk");
	driver.findElement(By.name("password")).sendKeys("hbkjhj");
	driver.findElement(By.xpath("//button[text()='Sign In']"));
	
	TakesScreenshot ts = (TakesScreenshot)driver;
	File S = ts.getScreenshotAs(OutputType.FILE);
	File d = new File(",/screenshot/ss1");
	Files.copy(S, d);
	}

}

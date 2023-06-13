package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Instagram {
	public static void main(String[] args) throws IOException {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.instagram.com/accounts/login/");
		WebElement btn = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
		if(btn.isEnabled())
		{
			System.out.println("we can perform login");
		}
		else
		{
			System.out.println("we can not perform login ss is taken");
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("./screenshot/loginbtn1.jpg");
			Files.copy(src, dest);
					
		}
	}

}

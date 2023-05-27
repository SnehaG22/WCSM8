package testNGDyanamicss;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import com.google.common.io.Files;

public class BaseTest {

	static WebDriver driver;
  @BeforeMethod
  public void setUp() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  }
  public void failedMethod() throws IOException
  {
	  TakesScreenshot ts = (TakesScreenshot)driver;
	   File src=ts.getScreenshotAs(OutputType.FILE);
	   File dest = new File("./screenshot/login.png");
	   Files.copy(src, dest);
  }
  
	   
  
}

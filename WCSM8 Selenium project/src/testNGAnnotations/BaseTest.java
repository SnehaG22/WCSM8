package testNGAnnotations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    static WebDriver driver;
    @BeforeMethod
    public void setUp()
    {
    	driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @AfterMethod
    public void tearDown() throws InterruptedException
    {
    	Thread.sleep(2000);
    	driver.quit();
    }
    
}
  

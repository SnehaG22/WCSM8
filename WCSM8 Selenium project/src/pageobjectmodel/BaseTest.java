package pageobjectmodel;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest extends File implements Constant {
	static WebDriver driver;
		public void openBrowser() throws IOException
		{
			File f = new File();
			String browservalue = f.getPropertyData(ProPATH, "browser");
			String url = f.getPropertyData(ProPATH, "url");
			
			if(browservalue.equalsIgnoreCase("chrome"))
			{
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.get(url);
			}
			else
			{
				System.out.println("invalid browser");
			}
		}
		public void closeBrowser()
		{
			driver.quit();
		}
		
	

}

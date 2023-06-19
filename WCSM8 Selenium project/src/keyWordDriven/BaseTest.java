package keyWordDriven;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest extends File implements Constant {
	static WebDriver driver;
	public void openBrowser() throws IOException {
		File fi = new File();
		String browservalue = fi.readPropertyData(ProPATH, "browser");
		String urlvalue = fi.readPropertyData(ProPATH,"url");
		if(browservalue.equalsIgnoreCase("CHROME"))
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(urlvalue);
		}
		else
		{
			System.out.println("Invalid Browser");
		}
	}
		public void closeBrowser()
		{ driver.close();
			
		}
		
	}



package keyWordDriven;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;

public class BaseTest extends Utility {
	public static void main(String[] args) {
		
	}
	public void openBrowser() throws IOException
	{
		Utility u = new Utility();
	     String browservalue = u.fetchProperty("browser").toString();
	       String url = u.fetchProperty("TestURL").toString();
	 if(browservalue.equals("chrome"))
	 {
	      WebDriver	 driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get(url);
	 }
	 else
	 {
		 
	 }
		 
	}

}

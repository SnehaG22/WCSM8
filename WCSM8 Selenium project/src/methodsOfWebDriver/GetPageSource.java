package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetPageSource {
	public static void main(String[] args) {
		  ChromeOptions co = new ChromeOptions();
		  co.addArguments("--remote-allow-origins=*");
          WebDriver driver=new ChromeDriver(co);
          driver.manage().window().maximize();
          driver.get("https://www.facebook.com/");
          System.out.println(driver.getPageSource());
	}

}

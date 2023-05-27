package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CloseMethod {
  //user to clse parent browser
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
             WebDriver driver=new ChromeDriver(co);
             driver.manage().window().maximize();
             driver.get("http://omayo.blogspot.com/");
             Thread.sleep(2000);
             driver.close();
	}
}

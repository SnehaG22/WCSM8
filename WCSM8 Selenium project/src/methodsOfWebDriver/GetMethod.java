package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetMethod {
	//is use to launch WebApllication
     public static void main(String[] args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.instagram.com/accounts/login/");
		
		
	}	


}

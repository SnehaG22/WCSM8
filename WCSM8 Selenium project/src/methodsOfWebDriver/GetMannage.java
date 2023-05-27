package methodsOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetMannage {
	public static void main(String[] args) throws InterruptedException {
		  ChromeOptions co = new ChromeOptions();
		  co.addArguments("--remote-allow-origins=*");
		  
		  WebDriver driver= new ChromeDriver(co);
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  
		  //set sixe of browser
		 Dimension tragetsize = new Dimension(450,650);
		  driver.manage().window().setSize(tragetsize);
		  Thread.sleep(2000);
		  
		  //set posistion
		  Point tragetposition = new Point(250, 150);
		  driver.manage().window().setPosition(tragetposition);
		  driver.get("https://www.instagram.com/accounts/login/");
		  
		   
	}

}

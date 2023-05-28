package javascriptexecuter;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUp {
	public static void main(String[] args) {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://dashboards.handmadeinteractive.com/");
		//to perform scroollup
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,350)");
		js.executeScript("window.scrollBy(0,-350)");
		
	}

}

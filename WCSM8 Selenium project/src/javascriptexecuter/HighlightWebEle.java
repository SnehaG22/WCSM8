package javascriptexecuter;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightWebEle {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.netflix.com/in/Login");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('id_userLoginId').style.background='yellow'");
	}

}

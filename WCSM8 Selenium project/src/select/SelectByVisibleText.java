package select;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByVisibleText {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Shweta%20Gadave/Desktop/WebElement/singleselectstaticdropdown.html");
		WebElement drop = driver.findElement(By.name("menu"));
		Select sel = new Select(drop);
		sel.selectByVisibleText("dosa");
	}

}

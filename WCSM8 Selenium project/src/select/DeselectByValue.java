package select;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByValue {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("file:///C:/Users/Shweta%20Gadave/Desktop/WebElement/Multiselectdropdown.html");
        WebElement drop = driver.findElement(By.name("menu"));
        Select sel = new Select(drop);
        sel.selectByValue("v1");
        Thread.sleep(2000);
        sel.deselectByValue("v1");
	}

}

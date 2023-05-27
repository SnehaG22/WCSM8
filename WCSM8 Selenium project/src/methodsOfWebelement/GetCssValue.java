package methodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {
public static void main(String[] args) {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.get("https://www.selenium.dev/downloads/");
	WebElement cssvalue = driver.findElement(By.xpath("//section[@class='row td-box td-box--gradient -bg-selenium-cyan p-2']"));
	 String value = cssvalue.getCssValue("font");
	 System.out.println(value);
}
}

package select;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptions {
	public static void main(String[] args) {
	   WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   driver.get("file:///C:/Users/Shweta%20Gadave/Desktop/WebElement/Multiselectdropdown.html");
		   WebElement drop = driver.findElement(By.name("menu"));
		   Select sel = new Select(drop);
		   for(int i=0;i<8;i++)
		   {
			   sel.selectByIndex(i);
		   }
		   List<WebElement> val = sel.getAllSelectedOptions();
		   for(WebElement op:val)
		   {
			   String allop = op.getText();
			   System.out.println(allop);
		   }
	}

}

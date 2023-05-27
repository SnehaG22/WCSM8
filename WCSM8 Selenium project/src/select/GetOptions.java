package select;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions {
	public static void main(String[] args) {
		WebDriver  driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   driver.get("file:///C:/Users/Shweta%20Gadave/Desktop/WebElement/singleselectstaticdropdown.html");
		   WebElement drop = driver.findElement(By.name("menu"));
		   Select sel = new Select(drop);
		   List<WebElement> val = sel.getOptions();
		   //to read all option
		   for(int i=0; i<val.size();i++)
		   {
			        String op = val.get(i).getText();
			        System.out.println(op);
		   }
		   
	}

}

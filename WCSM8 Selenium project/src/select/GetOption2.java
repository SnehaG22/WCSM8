package select;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOption2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver  driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   driver.get("file:///C:/Users/Shweta%20Gadave/Desktop/WebElement/singleselectstaticdropdown.html");
		   WebElement drop = driver.findElement(By.name("menu"));
		   Select sel = new Select(drop);
		   List<WebElement> val = sel.getOptions();
		   //select options using click method
		   for(WebElement op:val)
		   {
			   if(op.getText().equals("upma"))
			   
			   {
				   Thread.sleep(2000);
				   op.click();
				   break;
			   }
		   }
	}

}
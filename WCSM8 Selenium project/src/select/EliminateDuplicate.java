package select;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicate {
	public static void main(String[] args) {
		WebDriver  driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   driver.get("file:///C:/Users/Shweta%20Gadave/Desktop/WebElement/singleselectstaticdropdown.html");
		   WebElement drop = driver.findElement(By.name("menu"));
		   Select sel = new Select(drop);
		   //to get all options
		   List<WebElement> op = sel.getOptions();
		   //to eliminate duplicte use treeset
		   TreeSet<String> ts= new TreeSet<String>();
		   //to read by eliminating duplicate
		   for(int i=0;i<op.size();i++)
		   {
			   String all = op.get(i).getText();
			   // add text to treeset
			   ts.add(all);
			   
		   }
		   //to read op from treset
		   for(String L:ts)
		   {
			   System.out.println(L);
		   }
		   
	}

}

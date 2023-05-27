package select;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminteSingHS {
	public static void main(String[] args) {
		WebDriver  driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   driver.get("file:///C:/Users/Shweta%20Gadave/Desktop/WebElement/singleselectstaticdropdown.html");
		   WebElement drop = driver.findElement(By.name("menu"));
		   Select sel = new Select(drop);
		   List<WebElement> op = sel.getOptions();
		   //HS delet duplicate
		  HashSet<String> hs = new HashSet<String>();
		  // to read by eliminating duplicate
		  for(int i=0;i<op.size();i++)
		  {
			  String val = op.get(i).getText();
			  //add op to hashset
			  hs.add(val);
		  }
		  //read op from set
		  for(String options:hs)
		  {
			  System.out.println(options);
		  }
	}

}

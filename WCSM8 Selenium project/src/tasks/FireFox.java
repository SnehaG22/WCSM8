package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("dgsjkzdhksjdhcflks");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("hjdfhkjdrlsdj");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[contains(@name,'login')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Forgotten password?")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[contains(@id,'identify_email')]")).sendKeys("hdsfskhkjadfhjh");
	}

}

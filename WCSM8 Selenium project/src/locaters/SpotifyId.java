package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SpotifyId {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
  		co.addArguments("--remote-allow-origins=*");
  	    WebDriver  driver = new ChromeDriver(co);
  	    driver.manage().window().maximize();
  	    Thread.sleep(2000);
  	    driver.get("https://accounts.spotify.com/en/login?continue=https%3A%2F%2Fopen.spotify.com%2F__noul__%3Fl2l%3D1%26nd%3D1&_locale=en-IN");
  	  Thread.sleep(2000);
  	    driver.findElement(By.tagName("input")).sendKeys("Sneha G");
  	  Thread.sleep(2000);
  	    driver.findElement(By.id("login-password")).click();
	}

}

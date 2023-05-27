package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class OpenBrowser {
	static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
    Scanner sc=new Scanner(System.in);
    System.out.println("Chose a Browser you want");
    String browservalue=sc.next();
    if(browservalue.equalsIgnoreCase("chrome"))
    {
      driver=new ChromeDriver();
      driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
    }
    else    if(browservalue.equalsIgnoreCase("FIREFOX"))
    		{
                driver=new FirefoxDriver();
                Thread.sleep(2000);
        		driver.close();
    		}
    else
    {
    	System.out.println("Chosse valid Browser");
    }
                
    
	}


}

package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseFirefoxBrowser {
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
		//to max browser
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
	}

}

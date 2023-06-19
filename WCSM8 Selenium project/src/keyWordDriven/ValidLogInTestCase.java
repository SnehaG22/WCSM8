package keyWordDriven;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ValidLogInTestCase extends BaseTest {
	
	public static void main(String[] args) throws IOException {
		//to open a browser
		BaseTest bt = new BaseTest();
		//to read a data from property file
		File f = new File();
		bt.openBrowser();
		driver.findElement(By.name("username")).sendKeys(f.readPropertyData(ProPATH, "usrename"));
		driver.findElement(By.name("pwd")).sendKeys(f.readPropertyData(ProPATH, "password"));
        driver.findElement(By.id("loginButton")).click();
        bt.closeBrowser();
		
		
	}

}

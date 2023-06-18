package datadrivenframework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidCred extends File{
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://laptop-iaku8825/login.do");
	// to read a data from extrenal file create boj of File
	File f = new File();
	driver.findElement(By.name("username")).sendKeys(f.readExcelData("./Data/ActiitimeTestData.xlsx", "validcred", 1, 0));
	driver.findElement(By.name("pwd")).sendKeys(f.readExcelData("./Data/ActiitimeTestData.xlsx", "validcred", 1, 1));
	driver.findElement(By.id("loginButton")).click();
	}

}

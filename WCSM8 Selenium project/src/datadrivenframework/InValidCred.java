package datadrivenframework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InValidCred extends File {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://laptop-iaku8825/login.do");
		
		File file = new File();
		int rc = file.rowCount("./Data/ActiitimeTestData.xlsx", "invalidcred");
		for(int i=0;i<=rc;i++) {
			 String username = file.readExcelData("./Data/ActiitimeTestData.xlsx", "invalidcred", i, 0);
			 String password = file.readExcelData("./Data/ActiitimeTestData.xlsx", "invalidcred", i, 1);
			 
			 driver.findElement(By.name("username")).sendKeys(username );
			 driver.findElement(By.name("pwd")).sendKeys(password);
			 driver.findElement(By.id("loginButton")).click();
			 
		}
	}

}

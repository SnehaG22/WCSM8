package keyWordDriven;

import java.io.IOException;

import org.openqa.selenium.By;

public class InvalidLogInTest extends BaseTest{
	public static void main(String[] args) throws IOException {
		BaseTest bt = new BaseTest();
			bt.openBrowser();
		  File fi = new File();
		  int rc= fi.rowcount(excelPATH, "invalidcred");
		  for(int i=0;i<=rc;i++)
		  {
			  String usern = fi.readExcelData(excelPATH, "invalidcred", i, 0);
			  String pass = fi.readExcelData(excelPATH, "invalidcred", i, 1);
			  driver.findElement(By.name("username")).sendKeys( usern);
				driver.findElement(By.name("pwd")).sendKeys(pass);
		        driver.findElement(By.id("loginButton")).click();
		        bt.closeBrowser();
			  
		  }
		  
		
		
	}

}

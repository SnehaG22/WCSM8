package pageobjectmodel;

import java.io.IOException;

public class InvalidLoginTestCase extends BaseTest {
	public static void main(String[] args) throws IOException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		File f = new File();
		LogInPage lp = new LogInPage(driver);
		int rc = f.rowCount(excelPATH, "invalidcred");
		for(int n=0;n<=rc;n++)
		{
			String invalidusername = f.readExcelData(excelPATH, "invalidcred", n, 0);
			String invalidpass = f.readExcelData(excelPATH, "invalidcred", n, 1);
		
		lp.invalidLogin(invalidusername, invalidpass);
		}
		bt.closeBrowser();
		
		
	}

}

package pageobjectmodel;

import java.io.IOException;

public class ValidLoginTestCase extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		LogInPage lp = new LogInPage(driver);
		File f = new File();
		lp.validLogin(f.getPropertyData(ProPATH, "usrename"),f.getPropertyData(ProPATH, "password"));
		Thread.sleep(2000);
		bt.closeBrowser();
	}

}

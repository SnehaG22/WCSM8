package popup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPoup {
	public static void main(String[] args) {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("disable-notifications");
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.hdfcbank.com/personal/ways-to-bank/online-banking/net-banking");
	}

}

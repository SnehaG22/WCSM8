package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	//Store all the element on login page
	// declare allm the element @findby anotation
	@FindBy(name="username")private WebElement usernameT;
	@FindBy(name="pwd")private WebElement passwordT;
    @FindBy(id="loginButton")private WebElement loginbtn;
    
    public LogInPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    public WebElement getUsernameT() {
    	return usernameT;
    }
    public WebElement passwordT() {
    	return passwordT;
    }
    public WebElement loginbtnT() {
    	return loginbtn;
    }
    //oprational method
    public void validLogin(String validusername,String validpass)
    {
    	usernameT.sendKeys(validusername);
    	passwordT.sendKeys(validpass);
    	loginbtn.click();
    }
    public void invalidLogin(String invalidusername,String invalidpass)
    {
    	usernameT.sendKeys(invalidusername);
    	passwordT.sendKeys(invalidpass);
    	loginbtn.click();
    }
	
	
	

}

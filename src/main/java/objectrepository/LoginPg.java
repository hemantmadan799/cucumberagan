package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.BaseClass;

public class LoginPg extends BaseClass {
	
	public LoginPg()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='email']")
	WebElement txtUserName;
	@FindBy(xpath="//input[@name='password']")
	WebElement txtPassword;
	@FindBy(xpath="//div[text()='Login']")
	WebElement btnSubmit;
	
	public HomePg enterLoginCredentials(String username, String password)
	{
		txtUserName.sendKeys(username);
		txtPassword.sendKeys(password);
		btnSubmit.click();
		return new HomePg();
	}
	
	

}

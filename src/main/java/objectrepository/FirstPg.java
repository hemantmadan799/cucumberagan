package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.BaseClass;

public class FirstPg extends BaseClass {
	
	public FirstPg()
	{
		PageFactory.initElements(driver,  this);
	}
	
	@FindBy(xpath="//span[text()='Log In']")
	WebElement btnLogin;
	
	public LoginPg clickLoginButton()
	{
		btnLogin.click();
		return new LoginPg();
	}

}

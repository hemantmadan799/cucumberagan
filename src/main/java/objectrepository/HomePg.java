package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import basepackage.BaseClass;

public class HomePg extends BaseClass {
	public HomePg()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Contacts']")
	WebElement lnkContacts;
	
	@FindBy(xpath="//span[text()='Hemant Madan']")
	WebElement lblUserName;
	
	public boolean verifyCorrectUserName()
	{
		return lblUserName.isDisplayed();
			
	}
	public void createContact()
	{
		lnkContacts.click();
	}

	public String verifyHomePageTitle()
	{
		return driver.getTitle();
	}
//	public ContactsPage clickContacts()
//	{
//		lnkContacts.click();
//		return new ContactsPage();
//	}

}

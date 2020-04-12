package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.BaseClass;

public class ContactsPg extends BaseClass {
	
	@FindBy(xpath="(//button[@class='ui linkedin button'])[3]")
	WebElement btnNewContact;
	@FindBy(xpath="//div[@class='ui right corner labeled input']//input[@name='first_name']")
	WebElement txtFirstName;
	@FindBy(xpath="//label[text()='Last Name']/parent::div//input")
	WebElement txtLastName;
	@FindBy(xpath="//i[@class='save icon']")
	WebElement btnSave;
	
	public ContactsPg()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickNewContactButton()
	{
		btnNewContact.click();
		
	}
	public void enterFirstAndLastName(String fname, String lname) throws InterruptedException
	{

		txtFirstName.sendKeys(fname);
		txtLastName.sendKeys(lname);
	}
	public void hitSaveContactButton()
	{
		btnSave.click();
		
	}
	


}

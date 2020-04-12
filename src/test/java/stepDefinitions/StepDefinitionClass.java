package stepDefinitions;

import static myutilities.ExtentReportUtility.features;

import org.junit.Assert;

import com.aventstack.extentreports.gherkin.model.Feature;

import basepackage.BaseClass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import myutilities.ExtentReportUtility;
import objectrepository.FirstPg;
import objectrepository.HomePg;
import objectrepository.LoginPg;;


public class StepDefinitionClass extends BaseClass {
	FirstPg objFirstPg;
	LoginPg objLoginPg;
	HomePg objHomePg;
	ExtentReportUtility objExtentReportUtil=new ExtentReportUtility();
	
	 @Given("^user launches browser and open url$")
	    public void user_launches_browser()  {
	       BaseClass.initializeDriver("Chrome");
	    }

	 @And("^click on Login button$")
	 public void click_on_login_button() {
		 objFirstPg=new FirstPg();
		 objExtentReportUtil.myExtentReport();
		 features=objExtentReportUtil.extent.createTest(Feature.class, "Login Feature");
		 objLoginPg= objFirstPg.clickLoginButton();
		 
	 }
	    @When("^user enters login credentials$")
	    public void user_enters_login_credentials() {
	        objHomePg=objLoginPg.enterLoginCredentials("hrmadan799@gmail.com", "Qualitest@1");
	    }

	    @Then("^verify user name appears on Home Page$")
	    public void verify_user_name_appears_on_home_page() {
	       boolean bool=objHomePg.verifyCorrectUserName();
	       Assert.assertTrue(bool);
	    }


}

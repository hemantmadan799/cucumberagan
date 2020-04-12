package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * @author Hemant.Madan
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./src/test/java/features",
		glue = {"stepDefinitions"},
		plugin =  {"pretty", "html:test-output","json:target/cucumber.json" },
		dryRun = false,
		monochrome = true)
public class DriverScriptRunner {

}

package myutilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;
import basepackage.BaseClass;

public class ExtentReportUtility extends BaseClass {

	public ExtentReports extent;
	public ExtentTest scenarioDef;
	public static ExtentTest features;
	public String reportLocation="./target/";
	public void myExtentReport()
	{
		String fileName=reportLocation+"extentreport.html";
		extent=new ExtentReports();
		ExtentHtmlReporter htmlRe=new ExtentHtmlReporter(fileName);
		htmlRe.config().setTheme(Theme.DARK);
		htmlRe.config().setDocumentTitle("Test Report for Creating FreeCrm");
		htmlRe.config().setEncoding("utf-8");
		htmlRe.config().setReportName("Hemant Test Report Name");
		
		extent.attachReporter(htmlRe);
	}
	
	public void ExtentReportScreenshot() throws IOException
	{
		File  src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(src, new File(reportLocation+"screenshot.png"));
		scenarioDef.fail("failed method");
		
	}
	public void flushReport()
	{
		extent.flush();
		
	}
	
}

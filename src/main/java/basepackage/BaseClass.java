package basepackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	private static Properties prop;
	
	public BaseClass()
	{
		FileInputStream fis;
		try {
			fis = new FileInputStream("./src/test/resources/config.properties");
			try {
				prop=new Properties();
				prop.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void initializeDriver(String browserType)
	{
		if(browserType.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver",
					"C:\\Hemant\\workspaces\\PractiseWorkSpace\\Selenium\\selenium\\src\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
		}
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30,  TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30,  TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(prop.getProperty("url"));
	}
}

package general_Actions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentReporter;



public class CommonFunctions {

	public static WebDriver driver;
	public static Properties PropertyObject;
	public static org.apache.log4j.Logger myLogObject=org.apache.log4j.Logger.getLogger(CommonFunctions.class);
	static ExtentReports Reportobject;
	static ExtentHtmlReporter HTMLobject;
	
	
	public void ExtentReportLaunching() {
		Reportobject=new ExtentReports();
		HTMLobject=new ExtentHtmlReporter("XtentReport.html");
		Reportobject.attachReporter(HTMLobject);
		ExtentTest test=Reportobject.createTest("MyDemoAutomation");
	}
	
	public void Log4jFileCreation() {

		PropertyConfigurator.configure("Logging.properties");
	}

	public Properties PropertyfileReading() throws IOException {
		PropertyObject=new Properties();
		FileInputStream fileobj=new FileInputStream("GeneralData.properties");
		PropertyObject.load(fileobj);
		return PropertyObject;	
	}
	
    @BeforeSuite
	public void Browserlaunching() throws IOException {
    	Log4jFileCreation();
    	ExtentReportLaunching();
    	myLogObject.info("Property File Reading");
		PropertyfileReading();
		String url=PropertyObject.getProperty("url");
		String location=PropertyObject.getProperty("location");
		String browsername=PropertyObject.getProperty("browser");
		myLogObject.info("Verifying the Browser Name");
		if(browsername.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", location);
			driver=new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
		}
		else
		{
			System.out.println("Please Select the Chrome Browser");
		}
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
    @AfterSuite
    public void BrowserTermination() {
    	myLogObject.info("All Test Case Successfully Executed");
    	myLogObject.info("=========================================================");
    	driver.quit();
    	Reportobject.flush();
    }
}

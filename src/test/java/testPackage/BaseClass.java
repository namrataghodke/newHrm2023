package testPackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import testUtility.ScreenshotClass;
import testUtility.StaticBrowser;

public class BaseClass {
static WebDriver driver;

public static ExtentReports report;
public static ExtentHtmlReporter extent;
public static ExtentTest Logger;



@Parameters({"broswer"})



	
	
@BeforeTest
public void beforeTest(String broswer)
{
		   this.driver=driver;
	driver=StaticBrowser.browserLunching(broswer,"https://demoqa.com/text-box");
		
	report=new ExtentReports();
		
	extent=new ExtentHtmlReporter("test-output"+File.separator+"report"+ File.separator+"thread"+System.currentTimeMillis()+"html");
			 
	//extent=new ExtentHtmlReporter("test-output"+File.separator+"report"+File.separator+"HrmThread"+System.currentTimeMillis()+".html");
		report.attachReporter(extent);
		
	}	




	
@AfterTest
public void afterTest()
{
	
}
	

	
@AfterMethod
public void afterMethod(ITestResult result) throws IOException {
	
	if(result.getStatus()==ITestResult.FAILURE)
	{
		String path=ScreenshotClass.catureScreenShot( driver);
		
		//Logger.fail("test case fail",MediaEntityBuilder.createScreenCaptureFromPath(path).build());
		Logger.pass("test case pass",MediaEntityBuilder.createScreenCaptureFromPath(path).build());
		//Logger.fail("test case is fail",MediaEntityBuilder.createScreenCaptureFromPath(path).build());
		
		report.flush();
	}
	
}	
	
}	
	
	
	



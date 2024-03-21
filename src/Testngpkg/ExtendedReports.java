package Testngpkg;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ExtendedReports {
	
	WebDriver driver;
	String url="https://www.facebook.com/";
	ExtentReports extent;
	ExtentHtmlReporter reporter;
	ExtentTest test;
	
	@BeforeTest
	public void beftest()
	{
		 driver=new ChromeDriver();
		reporter = new ExtentHtmlReporter("./Reportss/myreport.html");
		reporter.config().setDocumentTitle("Automationreport");
		reporter.config().setReportName("Functional Test");
		reporter.config().setTheme(Theme.DARK);
		 extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("hostname","localhost");
		extent.setSystemInfo("os","windows11");
		extent.setSystemInfo("testername","Revathy");
		extent.setSystemInfo("Browser name","chrome");	
	}
	
	@BeforeMethod
	public void setup()
	{
		driver.get(url);
		
	}
	
	@Test
	public void fbtitleverification()
	{
		test=extent.createTest("Fbtitleverification");
		String exp="Facebook – log in or sign up";
		String actual=driver.getTitle();
		Assert.assertEquals(exp,actual);
		
	}
	
	@AfterMethod
	public void browserclose(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL,"test case failed is"+result.getName());
			test.log(Status.FAIL,"test case failed is"+result.getThrowable());
			//String screenshotpath=screenshotMethod(driver,result.getName()); 
			//test.addScreenCaptureFromPath(screenshotpath);
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP,"test case skipped is"+result.getName());
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS,"test case passed is"+result.getName());
		}
	}
	//private String screenshotMethod(ChromeDriver driver2, String name) {
		//return null;
	@AfterTest
	public void teardown()
	{
		extent.flush();
		
	}
}

package Testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Newpgm {
	ChromeDriver driver;
	String Url="https://register.rediff.com/register/register.php?FormName=user_details";
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void geturl()
	{
		driver.get(Url);
	}
	
	@Test (groups = {"smoke"})
	public void logodisplay()
	{
		Boolean logo=driver.findElement(By.xpath("//*[@id='wrapper']/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
		if(logo)
		{
			System.out.println("logo is displayed");

		}
		else
		{
			System.out.println("logo is not displayed");

		}
	}
	@Test (priority=2)
	public void titleverify()
	{
		String exp="rediff.com";
		String actual=driver.getTitle();
		if(actual.equals(exp))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
	
		}
	}
	@Test (groups = {"smoke","sanity"})
	public void buttonenabled()
	{
		Boolean button=driver.findElement(By.xpath("//input[@id='Register']")).isEnabled();
		if(button)
		{
			System.out.println("Button is  present");
		}
		else
		{
			System.out.println("Button is not present");

		}
	}
	@Test (priority=4)
	public void buttontext()
	{
		String textverify=driver.findElement(By.xpath("//*[@id=\'Register\']")).getAttribute("value");
		if(textverify.equals("Create my account >>"))
		{
			System.out.println("Text is present");

		}
		else
		{
			System.out.println("Text is not present");

		}
	}
	@Test (priority=5)
	public void fullnameverify()
	{
		String txt=driver.getPageSource();
		if(txt.contains("Full Name"))
		{
			System.out.println("Fullname is present");
			
		}
		else
		{
			System.out.println("Fullname is not present");
	
		}
	}
	@AfterClass
	public void teardown()
	{
		driver.quit();
		
	}
	
	}
	

	
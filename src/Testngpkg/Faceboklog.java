package Testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Faceboklog {
	ChromeDriver driver;
	String url="http://www.facebook.com";
	
	@BeforeTest
	public void display()
	{
		driver=new ChromeDriver();
		driver.get(url);
	}
	@Parameters({"username","password"})
	@Test
	public void facebooklogin(String username,String password)
	{
		driver.findElement(By.id("email")).sendKeys(username);
	
		driver.findElement(By.id("pass")).sendKeys(password);

	}
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
}

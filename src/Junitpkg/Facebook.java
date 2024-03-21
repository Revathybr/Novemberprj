package Junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	ChromeDriver driver;
	String baseurl="https://www.facebook.com";
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void facebookdetails() 
	{
		driver.findElement(By.id("email")).sendKeys("revathy123@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("revathy123@");
		driver.findElement(By.name("login")).click();

	}
	@After
	public void teardown()
	{
		driver.quit();
	}

}

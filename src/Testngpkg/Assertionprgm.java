package Testngpkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assertionprgm {
	ChromeDriver driver;
	String url="https://www.facebook.com/";
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(url);
		
	}
	@Test
	public void titlrverification()
	{
		String exp="Facebook";
		String actualtitle=driver.getTitle();
		Assert.assertEquals(actualtitle,exp);
		System.out.println("test1");
		
	}
}

package Junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newclasspgm {
	ChromeDriver driver;
	String url="https://www.flipkart.com/";
	
	@Before
	public void setup()
	{
		driver =new ChromeDriver();
		driver.get(url);
	}
	@Test
	public void titleveri()
	{
		String exp="Mobiles";
		String actual=driver.getTitle();
		if(actual.contains(exp))
		{
			System.out.println("Title verified");
		}
		else
		{
			System.out.println("Title not verified");

		}
	}
	@After
	public void teardown()
	{
		driver.quit();
	}
}


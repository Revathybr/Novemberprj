package Junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitprgm {
	ChromeDriver driver;
	String baseurl="https://www.flipkart.com";
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	
	@Test
	public void titleverification()
	{
		String exp="Flipkart";
		String actualtitle=driver.getTitle();
		if(actualtitle.equals(exp))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");

		}
	}
	
		@After
		public void tearDown()
		{
		driver.quit();
		
	}
}

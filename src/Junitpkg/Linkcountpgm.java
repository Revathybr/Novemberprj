package Junitpkg;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcountpgm {
	ChromeDriver driver;
	String url="https://www.instagram.com";
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(url);
	}
	@Test
	public void linkcount() throws InterruptedException
	{
		driver.manage().window().maximize();
		Thread.sleep(3000);
		List<WebElement> linklist= driver.findElements(By.tagName("a"));
		System.out.println(linklist.size());
		for(WebElement ele:linklist)
		{
			String link=ele.getAttribute("href");
			String linktext=ele.getText();
			System.out.println(link+"---------"+linktext);
		}
	}
	@After
	public void teardown()
	{
		driver.quit();
	}
	
}

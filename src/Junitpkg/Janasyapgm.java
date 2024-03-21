package Junitpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Janasyapgm {
	ChromeDriver driver;
	String url="https://www.janasya.com";
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();

		
	}
	@Test
	public void pageinfo() throws InterruptedException
	{
		String s="Janasya";
		String actualtitle=driver.getTitle();
		Thread.sleep(3000);
		driver.get(url);
		driver.findElement(By.xpath("//div[@id='HeaderNavigation']/nav/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"halo-sidebar\"]/div[2]/div[1]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"halo-sidebar\"]/div[2]/div[1]/div[2]/div/ul/li[1]")).click();
		WebElement search=driver.findElement(By.xpath("//input[@id='Search-In-Modal']"));
		search.sendKeys("saree",Keys.ENTER);
		List<WebElement> linklist= driver.findElements(By.tagName("a"));
		System.out.println(linklist.size());
		if(s.equals(actualtitle))
		{
			System.out.println("pass");
	
		}
		else
		{
			System.out.println("fail");

		}
	}

}

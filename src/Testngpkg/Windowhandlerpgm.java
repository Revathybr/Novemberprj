package Testngpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Windowhandlerpgm {
	ChromeDriver driver;
	String url="https://demo.guru99.com/popup.php";
	
	@BeforeMethod
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	
	@Test
	public void windowhandlemtd()
	{
		driver.get(url);
		String parentwindow=driver.getWindowHandle();
		System.out.println("parent window title: "+driver.getTitle());
		driver.findElement(By.xpath("/html/body/p/a")).click();
		
		Set<String>allWindowHandles=driver.getWindowHandles();
		for(String handle:allWindowHandles)
		{
			if(!handle.equalsIgnoreCase(parentwindow))
			{
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("revathybr1005@gmail.com");
				driver.close();
			}
			driver.switchTo().window(parentwindow);

		}
		
		
	}
	
}

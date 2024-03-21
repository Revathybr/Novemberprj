package Junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlepgm {
	ChromeDriver driver;
	String baseurl="https://www.google.com";
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void Googlesearch()
	{
		driver.get(baseurl);
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("book",Keys.ENTER);
				
		
		//driver.findElement(By.name("books")).click();

		
	}

}

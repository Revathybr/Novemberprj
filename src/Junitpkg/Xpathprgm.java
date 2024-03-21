package Junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathprgm {
	ChromeDriver driver;
	//String baseurl="https://www.facebook.com";
	String baseurl="https://www.instagram.com";

	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void facebookfunctions() throws InterruptedException
	{
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("revathy123@gmail.com");
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("revathy123@");
		driver.findElement(By.xpath("//form[@id='loginForm']/div/div[1]/div/label/input")).sendKeys("revathy123@gmail.com");
		WebElement search=driver.findElement(By.xpath("//form[@id='loginForm']/div/div[2]/div/label/input"));
		search.sendKeys("revathy123@",Keys.ENTER);

	}
	
	
}

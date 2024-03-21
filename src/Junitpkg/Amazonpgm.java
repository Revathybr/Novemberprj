package Junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonpgm {
	ChromeDriver driver;
	String url="https://www.amazon.com";
	
	@Before
	public void Setup()
	{
		driver=new ChromeDriver();
		
	}
	@Test
	public void amazonlogin() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.get(url);
		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("mobiles",Keys.ENTER);   //mobile search
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[3]")).click(); //registry
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();   //signin
		driver.navigate().back();   //go back
		driver.findElement(By.xpath("//div[@id='nav-cart-count-container']")).click();  //cart
		driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();    //click hamburger menu
		driver.findElement(By.xpath("//a[@id='icp-nav-flyout']")).click();  //click language
		
	}
}

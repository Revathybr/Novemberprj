package Testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Draganddrop {
	
	ChromeDriver driver;
	String url="https://demo.guru99.com/test/drag_drop.html";
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(url);
	}
	@Test
	public void dragdropmtd()
	{	driver.manage().window().maximize();
		WebElement bank=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement account=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		WebElement Sales=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		WebElement Account=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
		
		WebElement a1=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement amount=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		WebElement a2=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement amount1=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(bank,account);
		act.dragAndDrop(Sales,Account);
		act.dragAndDrop(a1,amount);
		act.dragAndDrop(a2,amount1);
		act.perform();

		String s=driver.getPageSource();
		if(s.contains("Perfect!"))
		{
			System.out.println("Text is present");
		}
		else
		{
			System.out.println("Text not present");

		}
	
	
	}

}

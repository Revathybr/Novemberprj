package Testngpkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Gurualertpgm {
	ChromeDriver driver;
	String url="https://demo.guru99.com/test/simple_context_menu.html";
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(url);
	}
	@Test
	public void alertmtd() throws InterruptedException
	{
		Thread.sleep(5000);
		WebElement rightclk=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		Actions act=new Actions(driver);
		act.contextClick(rightclk).perform();
		driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]/span")).click();
		driver.switchTo().alert().accept();
		
		WebElement doubleclk=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.doubleClick(doubleclk).perform();
		Alert a1=driver.switchTo().alert();
		String alerttext=a1.getText();
		System.out.println("alerttext= "+alerttext);
		a1.accept();

	}

}

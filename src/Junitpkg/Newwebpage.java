package Junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newwebpage {
	ChromeDriver driver;
	String url="file:///C:/Users/revat/OneDrive/Desktop/.html";
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	@Test
	public void displayalert() throws InterruptedException
	{
		Thread.sleep(3000); 
		driver.get(url);
		
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a=driver.switchTo().alert();
		String alerttext=a.getText();
		System.out.println("alerttext= "+alerttext);
		a.accept();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Revathy");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Syam");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

}

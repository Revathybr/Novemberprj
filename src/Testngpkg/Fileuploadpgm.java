package Testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploadpgm {
	ChromeDriver driver;
	String url="https://demo.guru99.com/test/upload/";
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(url);
	}
	@Test
	public void fileuploadmtd()
	{
		driver.findElement(By.xpath("//*[@id=\'uploadfile_0\']")).sendKeys("D:\\Revathy");
		Boolean box=driver.findElement(By.xpath("//*[@id=\'terms\']")).isSelected();
		if(box)
		{ 
			System.out.println("box is checked");
		}
		else
		{
			System.out.println("box  not checked");

		}
		driver.findElement(By.xpath("//*[@id=\'submitbutton\']")).click();
		String s=driver.findElement(By.xpath("//*[@id=\'submitbutton\']")).getText();
		if(s.contains("Submit File"))
		{
			System.out.println("Text is present");
	
		}
		else
		{
			System.out.println("Text  not present");

		}
		
	}

}

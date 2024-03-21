package Junitpkg;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotpgm { 
		ChromeDriver driver;
		String baseurl="https://www.facebook.com";
		@Before
		public void setUp()
		{
			driver=new ChromeDriver();
			driver.get(baseurl);
		}
		
		@Test
		public void screenshot()  throws IOException
		{
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File("D:\\screenshot.png"));
			
			WebElement loginbutton=driver.findElement(By.name("login"));
			File src1=loginbutton.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src1,new File("./screenshot/loginbutton.png"));
		}
	}


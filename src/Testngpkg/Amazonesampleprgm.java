package Testngpkg;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Amazonesampleprgm {
	ChromeDriver driver;
	String url="https://www.amazon.in/";
	
	@BeforeMethod
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
		@Test
		public void amazonpagemtd()
		{
			driver.get(url);
			driver.manage().window().maximize();
			WebElement search=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
			search.sendKeys("mobile phones",Keys.ENTER);
			String exp="Amazon.in : mobile phones";
			String act=driver.getTitle();
			if(exp.equalsIgnoreCase(act))
			{
				System.out.println("Title verified");
				
			}
			else
			{
				System.out.println("Title not verified");

			}
			
			String parentwindow=driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/span/div/div/div/div[1]/div/div[2]/div/span/a/div/img")).click();
		Set<String>allWindowHandles=driver.getWindowHandles();
		for(String handle:allWindowHandles)
		{
			if(!handle.equalsIgnoreCase(parentwindow))
			{
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[5]/div[3]/div[1]/div[3]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[37]/div[1]/span/span/span/input")).click();
				JavascriptExecutor js=(JavascriptExecutor)driver;    //scroll down
				js.executeScript("window.scrollBy(0,500)");
				WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(80));
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input"))).click();
				driver.close();
			}
			driver.switchTo().window(parentwindow);

		}
		
	
		}

}

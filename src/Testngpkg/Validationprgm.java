package Testngpkg;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Validationprgm {
	ChromeDriver driver;
	String exp="https://automationexercise.com/";
	String url="https://automationexercise.com/login";
	
	@BeforeMethod
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(url);

	}
	
	@Test
	public void validationmethod()
	{
		driver.findElement(By.name("email")).sendKeys("revathybr1005@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Revathysyam@1005");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();
		String actual=driver.getCurrentUrl();
		if(actual.equals(exp))
		{
			System.out.println("Login sucessfull");
		}
		else
		{
			System.out.println("Login not sucessfull");

		}

	}
}

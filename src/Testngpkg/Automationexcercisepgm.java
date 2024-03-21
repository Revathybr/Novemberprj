package Testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Automationexcercisepgm {
	ChromeDriver driver;
	String url="https://automationexercise.com/login";
	@BeforeMethod
	
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(url);
	}
	@Test
	public void Newsignin()
	{
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")).sendKeys("Revathysyam");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys("syamkrishnan00003@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
		driver.findElement(By.xpath("//*[@id=\"id_gender2\"]")).click();
		//driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Revathysyam");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Revathysyam@11005");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;    //scroll down
		js.executeScript("window.scrollBy(0,500)");
		
		WebElement day=driver.findElement(By.xpath("//*[@id=\"days\"]"));   //date of birth
		Select daydetails=new Select(day);
		daydetails.selectByValue("20");
		
		WebElement month=driver.findElement(By.xpath("//*[@id=\"months\"]"));
		Select month1=new Select(month);
		month1.selectByVisibleText("March");
		
		WebElement year=driver.findElement(By.xpath("//*[@id=\"years\"]"));
		Select year1=new Select(year);
		year1.selectByValue("1995");
		
		driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("Revathy");
		driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("B R");
		driver.findElement(By.xpath("//*[@id=\"company\"]")).sendKeys("Luminar");
		driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("Premnivas,kuriyode");
		driver.findElement(By.xpath("//*[@id=\"address2\"]")).sendKeys("malayinkil p.o");
		
		js.executeScript("window.scrollBy(0,500)"); //scroll down

		WebElement country=driver.findElement(By.xpath("//*[@id=\"country\"]"));
		Select co=new Select(country);
		co.selectByVisibleText("India");
		driver.findElement(By.xpath("//*[@id=\"state\"]")).sendKeys("Kerala");
		driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Trivandrum");
		driver.findElement(By.xpath("//*[@id=\"zipcode\"]")).sendKeys("695571");
		driver.findElement(By.xpath("//*[@id=\"mobile_number\"]")).sendKeys("9747245842");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/form/button")).click();



		
		
	}

}

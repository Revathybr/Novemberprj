package Junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Reddiffpgm {
	ChromeDriver driver;
	String url="https://register.rediff.com/register/register.php?FormName=user_details";
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(url);
	}
	@Test
	public void logindetails() throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement day=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]"));
		Select daydetails=new Select(day);
		daydetails.selectByValue("05");
		
		WebElement month=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]"));
		Select month1=new Select(month);
		month1.selectByVisibleText("JAN");
		
		WebElement year=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[3]"));
		Select year1=new Select(year);
		year1.selectByValue("2002");
		
		
		Boolean logo=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();  //logo is present
		if(logo)		
		{
			System.out.println("Logo is present");
			
		}
		else
		{
			System.out.println("Logo is not present");
	
		}
		
		Boolean radio=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]")).isSelected(); //radio  button is present
		if(radio)			
		{
			System.out.println("Radio button is present");

		}
		else
		{
			
			System.out.println("Radio button is not present");
		}
		
		
	}
	@After
	public void teardown()
	{
		driver.quit();
}

}

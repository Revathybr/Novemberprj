package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Createpage 
{
	WebDriver driver;
	
	By fbcreate=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	By fbsignin=By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div[2]/div/div/span/a");
	
	
	public Createpage(	WebDriver driver)
	{
		this.driver=driver;
		
	}
	public void fbclickmtd()
	{
		driver.findElement(fbcreate).click();
		String exp="Facebook";
		String act=driver.getTitle();
		if(exp.equals(act))
		{
			System.out.println("Title verified");
		}
		else
		{
			System.out.println("Title not verified");

		}
	}
		public void fbsigninmtd()
		{
		driver.findElement(fbsignin).click();
		}
		
	}


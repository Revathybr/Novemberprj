package testpkgg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Createpage;


public class Createacctest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void signinmtd()
	{
		Createpage obj=new Createpage(driver);
		obj.fbclickmtd();
		obj.fbsigninmtd();
	}
}

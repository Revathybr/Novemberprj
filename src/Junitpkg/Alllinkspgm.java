package Junitpkg;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alllinkspgm {
	ChromeDriver driver;
	String baseurl="https://www.facebook.com";
			
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void alllinks()
	{
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println("Total link count= "+li.size());
		for(WebElement ele:li)
		{
			String links=ele.getAttribute("href");
			verify(links);
			
		}
	}
	private void verify(String links) {
		try {		
		URL u=new URL(links);
		HttpURLConnection con=(HttpURLConnection)u.openConnection();
		con.connect();
		if(con.getResponseCode()==200)
		{
			System.out.println("The response code is 200- successfull");

		}
		else if(con.getResponseCode()==400)
		{
			System.out.println("The response code is 400- Broken link");

		}
		else
		{
			System.out.println("Invalid response code");

		}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());

		}
	}

}

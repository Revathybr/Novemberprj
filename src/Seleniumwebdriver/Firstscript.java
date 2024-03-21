package Seleniumwebdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstscript {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String s="Google";
		String actualtitle=driver.getTitle();
		if(s.equals(actualtitle))
		{
			System.out.println("Pass");
		}
			else
			{
				System.out.println("Fail");

			}
		driver.quit();

		}
	}



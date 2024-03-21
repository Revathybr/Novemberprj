package Seleniumwebdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesource {

	public static void main(String[] args) {
		//String baseurl="https://www.google.com";
		String baseurl="https://www.flipkart.com";
		ChromeDriver driver=new ChromeDriver();
		driver.get(baseurl);
		String src=driver.getPageSource();
		if(src.contains("Grocery"))
		{
			System.out.println("Grocery text is present");
			
		}
		else
		{
			System.out.println("Grocery text is not present");

		}
		
		driver.quit();
		
	}

}

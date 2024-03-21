package Testngpkg;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class XMLfileupload {
	ChromeDriver driver;
	String url="https://www.facebook.com";
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	@Test
	public void Multiplevalueenter() throws IOException
	{
		driver.get(url);
		FileInputStream fi=new FileInputStream("D:\\SYAM\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);  //return workbook details
		XSSFSheet sh=wb.getSheet("Sheet1");	//return sheet details
		int rowcount=sh.getLastRowNum();	//returns row count
		System.out.println(rowcount);
		
		for(int i=0;i<=rowcount;i++)
		{
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("username= "+username);
			String password=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("password= "+password);
			driver.findElement(By.name("email")).clear();
			driver.findElement(By.name("email")).sendKeys(username);
			driver.findElement(By.name("pass")).sendKeys(password);
			driver.findElement(By.name("login")).click();
			driver.navigate().refresh();
		}
		
		
	}
}

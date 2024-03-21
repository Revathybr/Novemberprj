package Junitpkg;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;

public class Linksvalidatepgm {
	String links="http://www.google.com";
	
	@Test
	public void test()
	{
		try {
			URL u=new URL(links);
			HttpURLConnection con=(HttpURLConnection)u.openConnection();  //http type cast
			int code=con.getResponseCode();
			System.out.println(code);
			
			if(code==200)   //because it is integer type
			{
				System.out.println("Response code is 200- successfull");

			}
			else
			{
				System.out.println("not a responce");
	
			}
		} 
		
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	

}

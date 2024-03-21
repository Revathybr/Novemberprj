package Testngpkg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
	@Parameters({"tool"})
	@Test	
	public void test(String tool)
	{
		System.out.println("value= "+tool);
		
	}
	
}

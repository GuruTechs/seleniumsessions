package pomExamples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day1 
{
	
	@BeforeClass
	public void beforeCls()
	{
		System.out.println("bfr cls executed");
	}
	
	@BeforeMethod
	public void bfrmthd() 
	{
		System.out.println("bfr mthd");
		
	}
	
	@Test
	public void demo()
	{
		System.out.println("demo");
	}
	
	@Test
	public void firsttest()
	{
		System.out.println("firstTest");
	}
	

	@Test
	public void thirdrdtest()
	{
		System.out.println("thirdrdtest exctd");
	}
	
	@AfterMethod
	public void aftrmthd() 
	{
		System.out.println("aftr mthd");
		
	}
	
	@AfterClass
	public void aftrcls()
	{
		System.out.println("aftr cls exctd");
		
	}
	

}

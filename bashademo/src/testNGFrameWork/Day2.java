package testNGFrameWork;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 
{
	@BeforeClass
	public void bfrcls()
	{
		System.out.println("bfr cls");
	}
	
	@BeforeMethod
	public void bfermthd()
	{
		System.out.println("bfr mthd");
	}
	
	
	@Test(groups= {"Smoke"})
	public void goldLoan()
	{
		System.out.println("GL printed");
	}
	
	@Test(groups = "regression")
	
	public void goldLoanemi() 
	{
		System.out.println("i will execute first");
		
	}

	@AfterMethod
	public void aftrmthd()
	{
		System.out.println("aftr mthd");
	}
	
	@AfterClass
	public void aftrcls()
	{
		System.out.println("aftr cls");
	}
	
	
	
}

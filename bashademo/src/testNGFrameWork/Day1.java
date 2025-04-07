package testNGFrameWork;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day1 
{
	@BeforeSuite
	public void suitemethod()
	{
		System.out.println("Before Suite executed");
	}
	
	@Test
	public void personalLoan() 
	{
		System.out.println("PL printed");
	}
	
	@Test(groups = "regression")
	public void carLoan()
	{
		System.out.println("CL printed");
	}
	
	@AfterSuite
	public void Afsuite()
	{
		System.out.println("iam the last as per your suite command");
	}

	
	
	
	
}





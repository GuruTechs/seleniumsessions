package testNGFrameWork;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 
{
	@Test(groups = "regression")
	public void homeLoanWebLogin()
	{
		System.out.println("web login Home");
	}
	
	@Parameters({"fb"})
	@Test
	public void mobilehomeLoanLogin(String fburl)
	{
		System.out.println("mobile login Home");
		System.out.println(fburl);
	}
	
	@Test
	public void APIhomeloan()
	{
		System.out.println("API login Home");
	}

}

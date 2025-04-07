package pomExamples;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day4 
{

	@Test
	public void webLoginCarLoan()
	{
		System.out.println("webLoginCarLoan()");
	}
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("before test");
	}
	@Test
	public void mobileLoginCarLoan()
	{
		System.out.println("mobileLoginCarLoan()");
	}
	
	@Test(dataProvider = "getData")
	public void loginCarLoan(String username,String password)
	{
		System.out.println("loginCarLoan");
		System.out.println(username + password);
	}

	@AfterTest
	public void aftertest()
	{
		System.out.println("after test");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[3][2];
		data[0][0]="1st username";
		data[0][1]="1st password";
		
		data[1][0]="1st username";
		data[1][1]="1st password";
		
		data[2][0]="1st username";
		data[2][1]="1st password";
		return data;
				
	}
	
	
	
	
	
	
	
}

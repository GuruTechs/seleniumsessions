package testNGFrameWork;

import org.openqa.selenium.devtools.v114.input.Input;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 
{
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("web login car");
	}
	
	
	@Test
	public void carLoanWebLogin()
	{
		System.out.println("web login car");
	}
	
	@Parameters({"URL"})
	@Test
	public void mobilecarLoanLogin(String fburl)
	{
		System.out.println("mobile login car");
		System.out.println(fburl);
	}
	@Test(groups= {"Smoke"})
	public void mobilebikeLoanLogin()
	{
		System.out.println("mobile login BIKE");
	}
	
	@Parameters({"URL"})
	@Test
	public void mobileSUVLoanLogin(String urlname)
	{
		System.out.println("mobile login SUV");
		System.out.println(urlname);
		

	}
	
	@BeforeMethod
	public void BFRmthd()
	{
		System.out.println("i will execute 1st before every test method present in the class");
	}
	
	@BeforeSuite
	public void Bfsuite()
	{
		System.out.println("iam the No:1");
	}
	
	@Test(dataProvider = "dataprovide")
	public void mobileJEEPLoanLogin(String username,String password)
	{
		System.out.println("mobile login JEEP");
		System.out.println(password);
		System.out.println(username);
	}
	
	@Test(dependsOnMethods= {"mobileSUVLoanLogin"})
	public void APIcarloan()
	{
		System.out.println("API login car");
	}
	
	@DataProvider
	public Object[][] dataprovide() 
	{
		Object[][] data=new Object[3][2];
		//1st set data
		data[0][0]="1stusername";
		data[0][1]="1stpassword";
		
		//2nd set data
		data[1][0]="2ndusername";
		data[1][1]="2ndpassword";
				
				//1st set data
		data[2][0]="3rdusername";
		data[2][1]="3rdpassword";
				return data;
				
			
      
				
		
		
		
		
		
		
	}
	

}

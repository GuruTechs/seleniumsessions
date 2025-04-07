package oopsconcepts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Inheritance1 
{
  public void dothis()
  {
	  System.out.println("i got executed here");
  }
  
  @BeforeMethod
  public void runmefirst()
  {
	  System.out.println("i ran 1st");
  }
  
  @AfterMethod
  public void runmeLast()
  {
	  System.out.println("run me last");
  }
  
}

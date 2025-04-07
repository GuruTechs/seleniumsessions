package javaBasicPrograms;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class Test1 
{
	@Test
	public void regular()
	
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		
		int count=0;
		
		for(int i=0;i<names.size();i++)
		{
			String actual=names.get(i);
			
			if(actual.contains("A"))
			{
				count++;
			}
			
		}
		System.out.println(count);
	}

}

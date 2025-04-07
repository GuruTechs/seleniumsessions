package pomExamples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day2 {

	@Parameters({"URL"})
	@Test
	public void secondTest(String url) 
	{
		System.out.println("2nd test");
		System.out.println(url);
	}

}

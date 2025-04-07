/**
 * 
 */
package pomExamples;

import org.testng.annotations.Test;

public class PS3 extends PS4
{
	int a;

	public PS3(int a)
	{
		super(a);
		this.a=a;
	}

	@Test
	public int increment()
	{
		a=a+1;
		return a;
	}
	@Test
	public int decrement()
	{
		a=a-1;
		return a;
	}

}

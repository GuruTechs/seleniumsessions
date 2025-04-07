/**
 * 
 */
package pomExamples;

import org.testng.annotations.Test;

/**
 * 
 */
public class PS2 extends PS1
{
	@Test
	public void testRun()
	{
	int a =3;
	dothis();
	
	PS3 ps3=new PS3(3);
	
	System.out.println(ps3.increment());
	System.out.println(ps3.decrement());
	
	System.out.println(ps3.multiplybyThree());
	System.out.println(ps3.multiplybyTwo());
	
	
	
	}
	


}

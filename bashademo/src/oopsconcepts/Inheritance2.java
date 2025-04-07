package oopsconcepts;

import org.testng.annotations.Test;

public class Inheritance2 extends Inheritance1
{
	@Test
	public void runclass()
	{
		
		
		Inheritance3 inh=new Inheritance3(3);
		int a=3;
		dothis();
		
		System.out.println(inh.increment());
		System.out.println(inh.decrement());
		
		Inheritance4 in4=new Inheritance4();
		
		System.out.println(in4.multplytwo());
		System.out.println(in4.multplythree());
	}

}
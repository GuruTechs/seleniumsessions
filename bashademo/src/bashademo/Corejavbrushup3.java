package bashademo;

public class Corejavbrushup3 {

	public static void main(String[] args) 
	{
		//===>STRING IS AN OBJECT THAT REPRESENTS THE SEQUENCE OF CHARACHTERS
		// String is two types 
		//* String literal
		
		
		//String S1="Shamsheer";
		// here when the data is same is in two Strings it does'nt creates a new memory 
		
		//* String with "new" keyword
		
		String S2=new String("basha");
		String S3=new String("basha");
		// here when the data is same is in two Strings it creates a new memory by using "new" key word.


		
		String S="Shamsheer basha shaik";
		String[] splittedarray =S.split("basha");
		
		System.out.println(splittedarray[0].trim());
		
		System.out.println(splittedarray[1].trim());
		
		for(int i=S.length()-1; i>=0; i--)
		{
			System.out.println(S.charAt(i));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

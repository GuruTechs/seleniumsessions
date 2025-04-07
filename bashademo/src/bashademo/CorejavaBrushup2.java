package bashademo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CorejavaBrushup2 {

	public static void main(String[] args) 
	{
		
		int[] arr2= {1,2,3,4,6,8,13,122};
		
		for(int i=0; i<arr2.length;i++)
		{
			if(arr2[i] % 2 == 0)
			{
				System.out.println(arr2[i]);
				break;
			}
			
			else
			{
				System.out.println(arr2[i] + "not divided by 2");
			}
		}
		
		
		ArrayList< String > a = new ArrayList<String>();
		
		a.add("simha");
		a.add("simba");
		a.add("cheetah");
		a.add("sher");
		//a.remove(2);
		System.out.println(a.get(2));
		
		for(int i=0; i<a.size(); i++)
		{
		System.out.println(a.get(i));
		}
		
		for(String value:a) 
		{
			System.out.println(value);
		}
		
		//System.out.println(a.contains("simba"));
		
		
		//arays converting to arraaylist
		
		String [] name={"sham","bashu","sher","shammu"};
		
		List<String> namearraylist=Arrays.asList(name);
		
		namearraylist.contains("bashu");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

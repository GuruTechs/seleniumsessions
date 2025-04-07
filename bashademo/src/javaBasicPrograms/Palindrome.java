package javaBasicPrograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int orgnum=num;
		
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		
		if(orgnum==rev) 
		{
			System.out.println(orgnum +  " the enterd nuber is a palindrome");
		}
		else
		{
			System.out.println(orgnum + " the entered number is not a palindrome");
			
		}
		

	}

}

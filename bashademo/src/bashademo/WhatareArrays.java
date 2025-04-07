package bashademo;

import java.util.Iterator;

public class WhatareArrays {

	public static void main(String[] args) 
	{
		//Array----> an array is an object that contains similar data type.
		//           array is used to store multiple values.
		
		int [] arr=new int[5];
		
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
		int[]arr2= {1,2,3,5,6,7};
		
	//loops
		 for(int i=0; i<arr.length; i++)
		 {
			 System.out.println(arr[i]);
		 }
		 
		 for(int i=0; i<arr2.length; i++)
		 {
			 System.out.println(arr2[i]);
		 }
		 
		 
		 String [] name={"sham","bashu","sher","shammu"};
		 
		for(int i=0;i<name.length; i++)
		 {
			 System.out.println(name[i]);
		 }
		 
		 for(String S:name)
		 {
			 System.out.println(S);
		 }

	}

}

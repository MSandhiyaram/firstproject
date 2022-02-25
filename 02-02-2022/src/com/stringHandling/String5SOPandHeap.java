package com.stringHandling;

public class String5SOPandHeap 
{

	public static void main(String[] args) 
	{
		String str1=new String("Hello");//Heap
		String str2="Hello";	//String Constant Pool
		System.out.println(str1==str2);	//compares the references
		System.out.println(str1.equals(str2));	//compares the value/data/state
		
		String str3=new String("Hello");
		String str4="Hello";
		System.out.println(str2==str4);	// true
		System.out.println(str1==str3);	// false
		
		//usage intern() is applicable 

	}

}

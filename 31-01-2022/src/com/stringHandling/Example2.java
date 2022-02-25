package com.stringHandling;

public class Example2 
{

	public static void main(String[] args) 
	{
		
		// How to Replace the second occurence of a character
		
		String str="EduBridgeLearning";
		System.out.println(str);
		int index=str.indexOf("e");
		System.out.println(index);
		String str1=str.substring(index+1,str.length());
		System.out.println(str1);
		System.out.println(str1.replaceFirst("e","A"));
		
		//If you have to remove all occurences except the first
		System.out.println(str1.replaceAll("e", "A"));
		
	
	
	
	
	}
	
}


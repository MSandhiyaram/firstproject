package com.stringHandling;

public class String3ScndOccurOfCh 
{

	public static void main(String[] args) 
	{
		//TASK:
		//how to replace the second occurence of a character
		String str="edubridgeLearning";
		System.out.println(str);
		
		int index=str.indexOf("e");
		System.out.println(index);
		
		String str1=str.substring(index+1,str.length());
		
		System.out.println(str1);
		
		System.out.println(str1.replaceFirst("e", "A"));
		
		//if you have to remove all occurences except the first
		System.out.println(str1.replaceAll("e", "A"));

	}

}

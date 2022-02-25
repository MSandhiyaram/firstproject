package com.palindrome;

import java.util.Scanner;

public class Example1 
{
	


	public static void main(String[] args) 
	{
		// This code continue by (2-2-2022 -> String 9)
		String str;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter any String:  ");
		str=scn.nextLine();

		StringBuffer buffer = new StringBuffer(str);
		buffer.reverse();     //Reverse the contents of the object using the reverse() method
		String data = buffer.toString();	//Convert the StringBuffer object to Sting using the toString() method.
		if(str.equals(data))
		{
			System.out.println("Given String is Palindrome");
		}
		else
		{
			System.out.println("Given String is not Palindrome");
		}
		scn.close();
	}


}



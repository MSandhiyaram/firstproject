package com.ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandling1 
{

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		try
		{
			
			System.out.println("Try Block Start");
			System.out.println("Enter the String:  ");
			String str=scanner.next(); //word  (len=1 to 4).. (char is start from 0.. so 0 to 3)..
			char ch=str.charAt(str.length());
			System.out.println("Character is:  ");
			System.out.println("End of the Try Block");
		}
		catch (Exception e) 
		{
			System.out.println("Catch Block Execution");
		}
		scanner.close();

	}

}

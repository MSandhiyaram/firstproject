package com.ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandling2 
{

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		int num1=scanner.nextInt();
		int num2=scanner.nextInt();
		int result=num1/num2;
		try
		{
			//System.out.println("Try Block Start");
			//System.out.println("Enter the  Two Numbers:   ");
			
			//System.out.println("End of try Block");
			result=num1/num2;
			System.out.println(result);
			
		}
		catch (Exception e)  //generalized catch block 
		{
			System.out.println("Exception encounterd");
		}
		scanner.close();

	}

}

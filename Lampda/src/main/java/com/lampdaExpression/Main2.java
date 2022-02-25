package com.lampdaExpression;

import java.util.Scanner;

public class Main2 
{

	public static void main(String[] args) 
	{
		
		
		Scanner scanner=new Scanner(System.in);
		//lambda Expression
		I3 i=()->{
			System.out.println("My Functional Interface!!");
		};
		i.show();
		
		//lambda Expression
		I2 i2=(a,b)->{
			return a+b;
		};
		
		int result=i2.add(23,45);
		System.out.println("Output of addition is "+result);
		//lambda Expression
		I4 i4=(a)->{
			if(a%2==0)
			{
				return "Even";
			}
			else
			{
				return "Odd";
			}
		};
		
		System.out.println("Enter a number : ");
		int num=scanner.nextInt();
		
		String status=i4.evenOdd(num);
		System.out.println(status);
	}

}
interface I2//FI
{
	int add(int a,int b);
}
interface I3//FI
{
	void show();
}
interface I4
{
	String evenOdd(int a);
}
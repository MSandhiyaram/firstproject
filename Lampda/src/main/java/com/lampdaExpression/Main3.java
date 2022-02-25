package com.lampdaExpression;

import java.util.Scanner;

public class Main3 
{

	public static void main(String[] args) 
	{
		Ab a=()->{
			System.out.println("Show");
			
		};
		
	}
}
interface Ab
{
	abstract void show(); //public abstract void show();<- is also possible and also 
	//suppose we not declare abstract its automatically default 
	
}

//to reduce the complexity of the language, lambda expressions are limited to work with
//functional interfaces only.
//SAM : Single Abstract Method

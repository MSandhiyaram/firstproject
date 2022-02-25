package com.polymorphism;

public class PolyWithOverloading 
{

	public static void main(String[] args) 
	{
		Add add=new Add();
		add.add(2);
		add.add(20,30);
		add.add(20.5f,20,20);
	}
}
		
		
class Add
{
	 void add(int a)
	{
		
		System.out.println("value of a: "+a);
	}
	void add(int a,int b)
	{
		
		System.out.println("addition of a and b:  "+(a+b));
	}
	void add(float a,int b,int c)
	{
		
		System.out.println("addition of a,b and c:  "+(a+b+c));
	}
	
}
//its related to array and loops
//TASK:
//Single method that must be able to add N numbers of values

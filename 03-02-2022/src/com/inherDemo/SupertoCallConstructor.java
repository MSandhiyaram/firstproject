package com.inherDemo;

public class SupertoCallConstructor 
{

	public static void main(String[] args) 
	{
		Cons2 cons2=new Cons2();
		//whenever we are creating the object,constructor gets auto-invoked.
		//className

	}

}

class Cons1 extends Object
{
	Cons1()
	{
		
		System.out.println("In class A");
	}
}
class Cons2 extends Cons1
{
	Cons2()
	{
		//super();
		System.out.println("In class B");
	}
}
/*
 * 2) In class B
 * 3) In class A
 *    In class B
 * 4) In class B
 *    In class A   
 * 
 * 
 */
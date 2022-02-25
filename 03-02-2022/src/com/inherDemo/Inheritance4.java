package com.inherDemo;

public class Inheritance4 
{

	public static void main(String[] args) 
	{
		Child11 c1=new Child11();
		c1.show();
		Child12 c2=new Child12();
		c2.show();

	}

}
class Parent1
{
	public void show()
	{
		System.out.println("Show method of Parent class");
	}
}

//private<default or friendly<protected<public
class Child11 extends Parent1
{
	
}
class Child12 extends Parent1
{
	public void show()
	{
		System.out.println("overridden method by Child12");
	}
}
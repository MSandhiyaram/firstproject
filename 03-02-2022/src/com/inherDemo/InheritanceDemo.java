package com.inherDemo;

public class InheritanceDemo 
{

	public static void main(String[] args) 
	{
		C c=new C();
		c.a=10;
		c.b=20;
		c.c=30;
		c.call();//10 20 30
		
		C c1=new C();
		c1.a=100;
		c1.b=200;
		c1.c=300;
		c1.call();//100 200 300
				
		c.call();//100 200 30
		B b=new B();
		b.a=11;
		b.show();
		
		
	}

}

class A extends Object
{
	static int a;//instance variable
	void show()
	{
		System.out.println("The value of a : "+a);
	}
}
class B extends A
{
	static int b;
	void display()
	{
		System.out.println("The value of a and b :"+a+" "+b);
	}
}
class C extends B
{
	int c;
	void call()
	{
		System.out.println("The value of member variables are a  : "+a+" b : "+b+" c :"+c);
	}
}
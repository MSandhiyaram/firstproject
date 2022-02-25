package com.nestedClass;


public class NestedClass4 
{

	public static void main(String[] args) 
	{
		//Class A
		A11 a=new A11();
		a.show();
		
	}

}

//local class
class A11
{
	void show()
	{
		int a=10;
		System.out.println(a);
		
		class B
		{
			void display()
			{
				System.out.println("display method of class I");
			}
		}
		
		B b1=new B();
		b1.display();
		
	}
}



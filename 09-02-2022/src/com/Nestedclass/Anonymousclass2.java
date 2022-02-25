package com.Nestedclass;

public class Anonymousclass2 
{

	public static void main(String[] args) 
	{
		
		IDE ide=new IDE() 
		{
			
			@Override
			void display() 
			{
				System.out.println("Anonymous Class");
			}
		};
		ide.display();
		IDE ide1=new IDE() 
		{
			
			@Override
			void display() 
			{
				System.out.println("Display Method");
			}
		};
		ide1.display();
		I1 i1=new I1() 
		{
			
			@Override
			public void show() 
			{
				System.out.println("Interface Anonymous Class");
			}
		};
		i1.show();
		I1 i2=new I1() 
		{
			
			@Override
			public void show() 
			{
				System.out.println("Show Method");
			}
		};
		i2.show();
	}

}

abstract class IDE
{
	abstract void display();//declaration

}
class Child extends IDE
{
	void display()
	{
		System.out.println("definition to Display");
	}
}
/*Anonymous : class without name 
 * to provide definitions to methods of abstract classes and interfaces
 *
 *
 */

interface I1
{
	 void show();//public 
	 static void disp()
	 {
		 System.out.println("fhkjr");
	 }
}

class Child1 implements I1
{
	public void show()
	{
		System.out.println("Definition to show");
	}
}

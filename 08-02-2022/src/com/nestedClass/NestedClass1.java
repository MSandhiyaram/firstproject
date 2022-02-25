package com.nestedClass;

public class NestedClass1 
{

	public static void main(String[] args) 
	{
		//Class A
		A a=new A();
		a.display();
		
		//Class B
		A.B b=a.new B();
		b.show();
		
		//Class D
		A.B.D d=b.new D();
		d.call();//a.new B().new D();
		
		//Class C
		A.C c=a.new C();
		c.disp();

	}

}
//A-->B-->-->C
//Member  Inner Class
class A
{
	private int a=10;
	class B//member inner class
	{
		class D
		{
			void call()
			{
				System.out.println("Another level increase");
			}
		}//D is close
		void show()
		{
			System.out.println("Member Inner class");
			System.out.println(a);
		}
	}// B is close
	class C
	{
		void disp()
		{
			System.out.println("Another Inner Class");
		}
	}//C is close
	void display()
	{
		System.out.println("Working with Outer Class");
	}
}//A is close

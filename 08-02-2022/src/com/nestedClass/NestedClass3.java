package com.nestedClass;


public class NestedClass3 
{
	static int a=10;

	public static void main(String[] args) 
	{
		//call show of B1
		A1.B1 ref=new A1.B1();
		ref.disp();// its non static method..//Also use static method But it will waste the Memory..

		A1.B1.show();// static method // its directly call ..There is no wastage of memory..
	}

}

//local class

class A1
{
	static class B1
	{
		static void show()
		{
			System.out.println("definition of show method");
		}
		void disp()
		{
			System.out.println("Non-static method");
		}
	}//class B end
}//class A end 


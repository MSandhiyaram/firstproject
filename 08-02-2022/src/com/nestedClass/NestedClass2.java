package com.nestedClass;

import com.nestedClass.Outer.Inner;

public class NestedClass2 
{

	public static void main(String[] args) 
	{
		//OUTER
		Outer outer=new Outer();
		outer.call();
		
		//INNER
		Outer.Inner inner1=outer.new Inner();
		inner1.show();
		
		//SUB-INNER
		Outer.Inner.SubInner subinner=inner1.new SubInner();
		subinner.disp();
		
	}

}

class Outer
{
	class Inner
	{
		class SubInner
		{
			void disp()
			{
				System.out.println("disp of sub inner");
			}
		}//sub inner close
		
		void show()
		{
			System.out.println("Calling inner class method");
		}
	}//Inner close 
	void call()
	{
		
		System.out.println(" Calling Class A Method");
	}
}//outer close

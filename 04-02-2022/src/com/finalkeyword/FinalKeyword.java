package com.finalkeyword;

public class FinalKeyword 
{
	public static void main(String[] args) 
	{
		final int a=10;
		//The final local variable a cannot be assigned. It must be blank and not using a compound assignment
		//a=20;
		ChildFinalShow chfs=new ChildFinalShow();
		chfs.show();
		

	}

}

/*
 * 
 * 
 * Final keyword : used to apply the restrictions
 * constant : const
 * 
 * final keyword 
 * ->variable : constant : no re-initialization will be allowed.
 * ->method : not allowed to override it.
 * ->class : no inheritance is allowed.
 */

class FinalShow
{
	void show()
	{
		System.out.println("Show method");
	}
}
class ChildFinalShow extends FinalShow
{
	void show()
	{
		System.out.println("Overriding ");
	}
}


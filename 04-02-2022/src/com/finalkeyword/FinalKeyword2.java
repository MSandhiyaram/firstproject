package com.finalkeyword;

public class FinalKeyword2 
{
	int INTEREST_RATE=10;//screaming snake case
	
	void show()
	{
		// In below variable "a" cannot be resolved to a variable
		//a=20;
		System.out.println(INTEREST_RATE);
	}
	

	public static void main(String[] args) 
	{
		FinalKeyword2 fk=new FinalKeyword2();
		fk.show();

	}

}

/**
 * const 1.5 final
 	final  : restrictions on the class and its components
 	variable : makes the variable constant means no re-initialization will be allowed.
 	method: overriding is not allowed.
 	class: inheritance will not be allowed.
 * 
 * 
 * 
 */

class Clock
{
	final void display()
	{
		System.out.println("calling display");
	}
}

final class Eclipse extends Clock
{
	int a;
	void show()
	{
		System.out.println("demo");
	}
	//in below method is Cannot override the final method from Clock
	//void display()
	//{
		//System.out.println("redefining");
	//}
}
// in below class is The type Hp cannot subclass the final class Eclipse
//class Hp extends Eclipse
	//{
	
	//}

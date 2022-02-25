package com.lampdaExpression;

public class Main1 {

	public static void main(String[] args) 
	{
		
		C c=new C();
		c.show();
		c.display();
		//anonymous class 
		I i=new I()
		{
			public void show()
			{
				System.out.println("Hello Programers!!!!");
			}
			public void disp()
			{
				System.out.println("Hello User!!!!!");
			}
		};
		i.show();
		//i.disp();
		
		
		
		
		
		//Lambda Expression
		
		//(argument list)->{}
		//->arrow-operator || arrow token
		//{}->body of the method
		I i1=()->{
		System.out.println("Hello User");
		};
	
		i1.show();
		
		

}

      
	}



interface I //functional interface
{
	void show();
	//void display();
	//void disp();
	
}
class C implements I
{
	public void show()
	{
		System.out.println("Hello World!!");
	}
	
	public void display()
	{
		System.out.println("Hello World!!!");
	}
}

//Lambda Expression :
//a new concept added in Java 8 that facilitates to write 
//long statements as an expression in the language
//Lambda expression are very useful in collections.
//fetch , iterate over collection.

//Lambda expression are especially used to provide implementation to
//the interfaces which are functional interfaces.
//
//functional interface that has only one method.
//Lambda expressions are treated as a function/method, so no speerate .class 
//file is created.

//Benefit :
//less code
package com.JavaOops1;

public class TestClass 
{
	

	public static void main(String[] args) 
	{

		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		Employee e4 = new Employee();
		
		System.out.println(e1.hashCode());			//hashcode is allocate a memory into RAM or Heap memory
		
		System.out.println("**************************************");

		System.out.println(e2.hashCode());

		System.out.println("*********************************");

		System.out.println(e3.hashCode());
		
		System.out.println("***********************************");

		System.out.println(e4.hashCode());

		
	}

}

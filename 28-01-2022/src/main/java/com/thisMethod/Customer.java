package com.thisMethod;


public class Customer 
{
	int id;
	String name;
	
	public Customer() 
	{
		this(20,"abc");
		System.out.println("Default constructor");
		
	}
	
	public Customer(int id, String name) 
    {
		/**
		 * Constructor call must be the first statement in a constructor
		 */
		//this();
		
		this.id = id;
		this.name = name;
		System.out.println("Parameterized constructor");
	}



	public static void main( String[] args )
    {
    	
    	Customer customer=new Customer();
    	Customer customer1=new Customer(20,"abc");
    	
    	
    }
}

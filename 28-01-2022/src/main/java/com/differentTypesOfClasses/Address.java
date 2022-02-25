package com.differentTypesOfClasses;

//Abstract class
public abstract class Address 
{
	String address;
	static String state;

	public Address() 
	{


	}
	//blocks	
	//instance initializer block
	{
		address="Chennai";
	}
	static
	{
		state="TamilNadu";
	}
	public Address(String address) 
	{

		this.address = address;

	}

	public void getAddress()
	{
		System.out.println(address);

	}
	public static void getState()
	{
		System.out.println(state);
	}
	/**
	 * abstract method:
	 * 
	 * 1. Abstract methods do not specify a body or have a body part
	 */
	public abstract void getStudentaddress();
	public static void main(String[] args) 
	{
		//Cannot instantiate the type Student
		//Student student=new Student();
		System.out.println(state);
		

	}



}

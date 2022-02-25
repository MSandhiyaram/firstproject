package com.inheritance;

public class Address 
{
	String address;
	
	public Address() 
	{
		address="chennai";
		
	}
	
	public Address(String address) 
	{
		
		this.address = address;
	}
	
	public void getStudentAddress()
	{
		System.out.println(address);
		
	}


}

package com.abstraction;

public class Address 
{
	private String address;
	String state;
	
	public Address() 
	{
		address="chennai";
		state="TamilNadu";
		
	}
	
	public Address(String address) 
	{
		
		this.address = address;
		
	}
	
	public void getStudentAddress()
	{
		System.out.println(address);
		System.out.println(state);
		
	}


}

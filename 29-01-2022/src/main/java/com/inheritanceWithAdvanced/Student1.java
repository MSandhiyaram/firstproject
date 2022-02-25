package com.inheritanceWithAdvanced;

//Student1: super/parent/base class	
public abstract class Student1 
{
	String address;
	String countryName;
	
	public Student1() 
	{
		address="chennai";
		countryName="India";
		
	}

	public Student1(String address) 
	{
		
		this.address = address;
	}
	public void getStudentAddress()
	{
		System.out.println(address);
	}


	

}

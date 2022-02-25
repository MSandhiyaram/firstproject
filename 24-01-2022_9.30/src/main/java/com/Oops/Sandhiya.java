package com.Oops;

public class Sandhiya 
{

	String name;
	int age;
	String address;
	public Sandhiya()
	{

		name="Sandhiya";
		age= 23;
		address="UTR";

	}
	public void getSandhiyaInfo()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);


	}



	public static void main(String[] args) 
	{

		Sandhiya s=new Sandhiya();
		s.getSandhiyaInfo();
	}

}

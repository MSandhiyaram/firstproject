package com.differentTypesOfClasses;

//Normal class

public class Student1 
{


	//variables	
	int rollno;
	String name;


	static String address;

	public Student1() 
	{

		rollno = 30;
		name = "Renu";
	}

	//instance initializer block
	{

	}

	//static block
	static
	{
		address="abc";
	}

	//methods
	public void getStudentData()
	{
		System.out.println(rollno);
		System.out.println(name);
	}

	public static void getStudentAddress()
	{
		System.out.println(address);
	}

	public static void main(String[] args) 
	{		
		//objects
		Student1 stu = new Student1();
		stu.getStudentData();
		stu.getStudentAddress();
	}

}




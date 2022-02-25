package com.abstraction;

public class Student extends Address
{
	int rollno;
	String name;
	
	//default constructor
	public Student() 
	{
		
		
	}
	
	//parameterized constructor
	public Student(int rollno, String name) 
	{
		this.rollno = rollno;
		this.name = name;
	}
	
	public void getStudentInfo()
	{
		System.out.println(rollno);
		System.out.println(name);
		//System.out.println(address);	//The field Address.address is not visible
		System.out.println(state);
	}

	public static void main(String[] args) 
	{
		Student stu = new Student(20,"Hema");
		stu.getStudentInfo();
		
	}
	

}

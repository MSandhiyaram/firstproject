package com.encapsulation;

	//Encapsulation: Binding all class properties in one unit

public class Student 
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
		
	}

	public static void main(String[] args) 
	{
		Student stu = new Student(20,"Hema");
		stu.getStudentInfo();
		

	}
	

}

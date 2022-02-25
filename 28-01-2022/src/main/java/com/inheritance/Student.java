package com.inheritance;

	//Inheritance: "Reusing" the class properties by another class
public class Student extends Address
{
	int rollno;
	String name;
	
	//default constructure
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
		System.out.println(address);
		
	}

	public static void main(String[] args) 
	{
		Student stu = new Student(20,"Hema");
		stu.getStudentInfo();
		
	}
	

}

package com.inheritanceWithAdvanced;

//Student : sub/child/derived class
public class Student extends Student1
{
	int rollno;
	String name;
	
	public Student() 
	{
		rollno=30;
		name="Divya";
	}
	
	

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
		//creating object for sub class 
		Student student=new Student();
		
		student.getStudentInfo(); //sub
		student.getStudentAddress(); //super
		
		System.out.println("*****************************************************");
		
		//creating object for super class
		
		Student1 student1=new Student();
		student1.getStudentAddress();//super
		//student1.getgetStudentInfo();
		
		System.out.println("*****************************************************");
		
		Student Student2 = new Student(); //sub to super => this will work
		
		Student2.getStudentAddress();//super
		//Student2.getStudentInfo();
		
		System.out.println("*****************************************************");
		
		//Student student1 = new Student1();//super to sub => this will not work
		
		
		

	}

}

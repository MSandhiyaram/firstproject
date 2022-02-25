package com.inheritanceWithAbstractClass;

//Normal Class
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
		System.out.println(address);
		
	}
	//here we are given body/implementation to abstract method of student class
	public void getStudentCountry()
	{
		System.out.println(countryName);
	}
	



	public static void main(String[] args) 
	{
		Student student=new Student();
		student.getStudentInfo();
		student.getStudentCountry();
		

	}

}

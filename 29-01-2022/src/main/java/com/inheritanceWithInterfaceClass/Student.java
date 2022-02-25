package com.inheritanceWithInterfaceClass;

//Normal Class
public class Student implements Country
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
	public void getCountryName()
	{
		
		System.out.println(countryName);
	}
	



	public static void main(String[] args) 
	{
		Student student=new Student();
		student.getStudentInfo();
		student.getCountryName();
		

	}

}

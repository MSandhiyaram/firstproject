package com.singleInheritance;
import java.io.*;
import java.lang.*;
import java.util.*;
class Student 
{
	public void getStudentlearn()
	{
		System.out.println("Java Program");
	}
}
class Student1 extends Student
{
	public void getStudentlearn1()
	{
		System.out.println("for Single Inheritance ");
		
	}


public static void main(String[] args) 
{
	Student1 stu=new Student1();
	stu.getStudentlearn();
	stu.getStudentlearn1();


}
}



package com.JavaOops3;

public class TestClass 
{
	

	public static void main(String[] args) 
	{

		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();

		e1.getEmployeeInfo();

		System.out.println("*****************************");

		e1.employeeWorksFor();

		System.out.println("****************************");

		e2.getEmployeeInfo();

		System.out.println("******************************");

		e2.employeeWorksFor();

		System.out.println("*********************************");

		e3.getEmployeeInfo();

		System.out.println("*********************************");

		e3.employeeWorksFor();

		
	}

}

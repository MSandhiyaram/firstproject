package com.JavaOops2;

//class name is employee

/**
 * 
 * class consists of state(variables) and behavior(methods)	
 *
 */

public class Employee 
{
	//state(variables)
	int employeeId;
	String employeeName;
	double employeeSalary;


	//parameterized constructor
	public Employee(int employeeId1, String employeeName1, double employeeSalary1) 
	{
		employeeId = employeeId1;
		employeeName = employeeName1;
		employeeSalary = employeeSalary1;
	}

	//behavior(methods)
	public void getEmployeeInfo()
	{
		System.out.println(employeeId);
		System.out.println(employeeName);
		System.out.println(employeeSalary);

	}

	public void employeeWorksFor()
	{

		System.out.print("With employee id-");
		System.out.print(employeeId);
		System.out.print(" and ");
		System.out.print("employee name-");
		System.out.print(employeeName);
		System.out.println(" Works for IBM");

	}
}

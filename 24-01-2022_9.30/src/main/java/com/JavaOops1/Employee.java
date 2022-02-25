package com.JavaOops1;

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
	
	//default or zero-parameterized constructor
	
	public Employee() 
	{
		employeeId = 4204;
		employeeName = "Sandhiya";
		employeeSalary = 30944.34;
		
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

package com.Oops;

//class name is employee
/**
 * 
 * class consists of state(variables) and behavior(methods)	
 *
 */

public class Employee 
{
	//state(variables)
	String employeeName;
	int employeeId;
	double employeeSalary;
	public Employee() //default constructor
	{

		employeeName="Sandhiya";
		employeeId= 4204;
		employeeSalary=35468.87;

	}




	public Employee(String employeeName, int employeeId, double employeeSalary) //parameterized constructor
	{

		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.employeeSalary = employeeSalary;
	}



	//behavior(methods)
	public void getEmployeeInfo()
	{
		System.out.println(employeeName);
		System.out.println(employeeId);
		System.out.println(employeeSalary);


	}



	public static void main(String[] args) 
	{

		Employee emp=new Employee();

		Employee emp1=new Employee("renu",3241,40987.98);
		emp.getEmployeeInfo();
		System.out.println("***********************************");
		emp1.getEmployeeInfo();
	}

}

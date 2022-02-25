package com.JavaOops2;

public class TestClass 
{
	

	public static void main(String[] args) 
	{

		Employee e1 = new Employee(101, "Sandhiya", 58474.45);
		Employee e2 = new Employee(102, "Devi", 90474.41);
		Employee e3 = new Employee(103, "Narmada", 89456.48);

		e1.getEmployeeInfo();

		System.out.println("****************************************");

		e1.employeeWorksFor();

		System.out.println("********************************");

		e2.getEmployeeInfo();

		System.out.println("************************************");

		e2.employeeWorksFor();

		System.out.println("**************************************");

		e3.getEmployeeInfo();

		System.out.println("***********************************");

		e3.employeeWorksFor();		

		
		
	}

}

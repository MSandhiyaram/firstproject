package com.JavaOops;

public class TestClass 
{
	

	public static void main(String[] args) 
	{

		Employee e1=new Employee();
		/**
		 * 
		 * From above instruction line 10
		 * 
		 * "Employee" is a class name and it behave like user defined data type.
		 * 
		 * "e1" is an object reference(any variable name)
		 * 
		 * "new" is a keyword, use to create an object and it allocates 
		 *  memory inside RAM(i.e special memory called HEAP).
		 *  
		 *  "Employee()" is a constructor, use to initialize an object's state.
		 * 
		 */
		e1.getEmployeeInfo();
		System.out.println("******************************");
		e1.employeeWorksFor();
		
	}

}

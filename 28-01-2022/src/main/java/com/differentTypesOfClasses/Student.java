package com.differentTypesOfClasses;

//interface class
public abstract interface Student
{
		//The blank final field  may not have been initialized

		//variables
		
		//no non-static variables
	 // int id;
		
		//no static variables
	 //static String name;
		
		//** final variables: in interface by default all variables are final variables
		int id=2020;
		String name="abc";
		
		//no constructor
		
		//no blocks
		
		//methods
		
		//no non-static methods
		//static method
		
		public static void getStudentInfo()
		{
			System.out.println(id);
			System.out.println(name);
			
		}
		//**abstract methods: in interface by default all methods are abstract methods
		public abstract void getStudentId();
		
		public static void main(String[] args) 
		{
			//Cannot instantiate the type Student
			//Student stu=new Student();
			System.out.println(id);
			System.out.println(name);
		}
		
}

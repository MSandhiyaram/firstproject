package com.aggregation;
import java.util.ArrayList;
import java.util.List;

//class1
//Student class
public class Student 
{

	int id;
	String name;
	String dept;


	public Student(int id, String name, String dept) 
	{

		this.id = id;
		this.name = name;
		this.dept = dept;
	}
}
//class 2
//Department class
class Department
{
	String name;
	private List<Student> students;

	public Department(String name, List<Student> students)
	{

		this.name = name;
		this.students = students;
	}
	public List<Student> getStudents()
	{
		return students;
	}
}
//class 3
// institute class
class Institute
{

	String instituteName;
	private List<Department> departments;

	public Institute(String instituteName, List<Department> departments) 
	{

		this.instituteName = instituteName;
		this.departments = departments;
	} 
	public int getTotalStudentsInInstitute()
	{

		int noOfStudents=0;
		List<Student> students;

		for(Department dept : departments)
		{

			students=dept.getStudents();
			
			for(Student s : students)
			{
				noOfStudents++;
			}
		}
		return noOfStudents;
	}


}
//class 4
//main class
class GFG
{

	//main method
	public static void main(String[] args) 
	{
		//Creating object of Student class inside main
		Student s1=new Student(1,"Sandhiya","CSE");
		Student s2=new Student(2,"Narmatha","CSE");
		Student s3=new Student(3,"uma","ECE");
		Student s4=new Student(4,"Revathi","EEE");

		//Creating a List of CSE Students

		List<Student> cse_students=new ArrayList<Student>();

		//Adding CSE students
		cse_students.add(s1);
		cse_students.add(s2);

		//Creating a List of ECE Students
		List<Student> ece_students=new ArrayList<Student>();

		//Adding EEE students
		ece_students.add(s4);

		//Creating a List of EEE Students
		List<Student> eee_students=new ArrayList<Student>();

		//Adding ECE students
		eee_students.add(s4);

		//Creating objects of CSE,ECE and EEE 
		Department CSE = new Department("CSE",cse_students);
		Department ECE = new Department("ECE",ece_students);
		Department EEE = new Department("EEE",eee_students);

		List<Department> departments = new ArrayList<Department>();
		departments.add(CSE);
		departments.add(ECE);
		departments.add(EEE);

		//Creating instance of institute
		Institute institute = new Institute("EduBridge", departments);

		System.out.println("Total Student in Institute:  ");

		// Calling method to get total number of students
		// in institute and printing on console
		System.out.println(institute.getTotalStudentsInInstitute());
		
		

	}

}













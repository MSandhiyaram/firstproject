package com.aggregation;


public class Aggregation2 
{

	public static void main(String[] args) 
	{
		StudentName studentName=new StudentName("Pri","ya","Dharshini");
		StudentDetails sd=new StudentDetails(studentName);
		sd.display();
	}

}

class StudentName
{
	String fName,mName,lName;

	public StudentName(String fName, String mName, String lName) 
	{
		super();
		this.fName = fName;
		this.mName = mName;
		this.lName = lName;
	}	
}

class StudentDetails 
{
	
	StudentName studentName;//aggregation
	public StudentDetails(StudentName studentName) 
	{
		super();
		this.studentName = studentName;
	}
//StudentName studentName=new StudentName("Akash","Singh","Malhotra");
	void display()
	{
		System.out.println(studentName.fName+""+studentName.mName+" "+studentName.lName);
	}
	
	
}
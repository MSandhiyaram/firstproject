package com.aggregation;

import java.util.Scanner;

public class Aggregation 
{

	public static void main(String[] args) 
	{
		//Input from User

		Scanner scn=new Scanner(System.in);
		System.out.println("*****************Enter the Details********************");
		System.out.println("Enter FirstName:  ");
		String fName=scn.next();
		System.out.println("Enter MiddletName:  ");
		String mName=scn.next();
		System.out.println("Enter LastName:  ");
		String lName=scn.next();
		System.out.println("Enter contact:  ");
		String cont=scn.next();
		System.out.println("Enter Department:  ");
		String dept=scn.next();
		System.out.println("Enter BasicPay:  ");
		int bPay=scn.nextInt();
		System.out.println("Enter eAllowence:  ");
		int eAllw=scn.nextInt();
		System.out.println("Enter Iccentive:  ");
		int iCen=scn.nextInt();
		
		EmpName empn=new EmpName(fName,mName,lName);
		Salary salary=new Salary(bPay, eAllw, iCen);
		EmpDetails empD=new EmpDetails(empn,cont,dept,salary);
		empD.display();
		
		scn.close();
		

	}

}

class Salary
{
	int basicpay;
	int entertainmentAllowence;
	int icentive;
	public Salary(int basicpay, int entertainmentAllowence, int icentive) 
	{
		super();
		this.basicpay = basicpay;
		this.entertainmentAllowence = entertainmentAllowence;
		this.icentive = icentive;
	}
}
class EmpName
{
	String fName,mName,lName;

	public EmpName(String fName, String mName, String lName) {
		super();
		this.fName = fName;
		this.mName = mName;
		this.lName = lName;
	}
}
class EmpDetails
{
	EmpName empname;
	String contact,dept;
	Salary salary;
	
	
	public EmpDetails(EmpName empname, String contact, String dept, Salary salary) {
		super();
		this.empname = empname;
		this.contact = contact;
		this.dept = dept;
		this.salary = salary;
	}
	
	
	void display()
	{
		//method should be able to provide details about empname,contact and salary.
		//Salary->addition of basicpay,entertainmentAllowence,incentive.
		System.out.println("Name:  ");
		System.out.println(empname.fName+" "+empname.mName+" "+empname.lName+" ");
		System.out.println(contact);
		System.out.println(dept);
		System.out.println(salary.basicpay+salary.entertainmentAllowence+salary.icentive);
		System.out.println(salary);
	}
}
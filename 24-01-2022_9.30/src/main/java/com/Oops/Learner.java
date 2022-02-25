package com.Oops;

public class Learner 
{
	int learnerId;
	String learnerName;
	String learnerAddress;
	String learnerCity;

	public Learner() //default constructor
	{
		learnerId=4204;
		learnerName="M.Sandhiya";
		learnerAddress= "UTR";
		learnerCity="Taminadu";

	}

	public Learner(int learnerId, String learnerName, String learnerAddress, String learnerCity) 
	{

		this.learnerId = learnerId;
		this.learnerName = learnerName;
		this.learnerAddress = learnerAddress;
		this.learnerCity = learnerCity;
	}

	public void getLearnerInfo()
	{
		System.out.println("Learner id      : "+learnerId);
		System.out.println("Learner Name    : "+learnerName);
		System.out.println("Learner Address : "+learnerAddress);
		System.out.println("Learner City    : "+learnerCity);


	}



	public static void main(String[] args) 
	{

		Learner l1=new Learner();

		Learner l2=new Learner(3241,"renu","KPM","Tamilnadu");
		l1.getLearnerInfo();
		System.out.println("***********************************");
		l2.getLearnerInfo();
	}

}

package com.JavaOops4;

public class Customer 

{
	//state(variables)
		int customerId;
		String customerName;
		String customerAddress;
		
		//default or zero-parameterized constructor
		public Customer()
		{
			customerId = 123;
			customerName = "ABC";
			customerAddress = "CHENNAI";
		}

		public Customer(int customerId, String customerName, String customerAddress) 
		{
			this.customerId = customerId;
			this.customerName = customerName;
			this.customerAddress = customerAddress;
		}	
		
		public void getData()
		{
			System.out.println(customerId);
			System.out.println(customerName);
			System.out.println(customerAddress);
		}	

	public static void main(String[] args) 
	{
		Customer customer11 = new Customer();
		customer11.getData();
		
		System.out.println("*******************************************");
		
		Customer customer12 = new Customer();
		customer12.getData();
		
		System.out.println("***************************************");
		
		Customer customer21 = new Customer(239, "klm", "pqr");
		customer21.getData();
		
		System.out.println("******************************************");
		
		Customer customer22 = new Customer(877, "lmn", "tsr");
		customer22.getData();
		
		

	}

}

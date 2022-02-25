package com.Nestedclass;

public class Anonymousclass1 
{

	public static void main(String[] args) 
	{
		
		Car car=new Car() //Anonymous class
		{
			
			@Override
			public void price() 
			{
				System.out.println("Car price 5lak");
			}
			
			@Override
			public void mileage() 
			{
				System.out.println("300Km");
			}
			
			@Override
			public void fuel() 
			{
				System.out.println("5lit");
			}
		};
		car.price();
		car.fuel();
		car.mileage();
		
		Car car1=new Car()
		{
			
			@Override
			public void price() 
			{
				System.out.println("Car price 10lak");

			}
			
			@Override
			public void mileage() 
			{
				System.out.println("400Km");
			}
			
			@Override
			public void fuel() 
			{
				System.out.println("5lit");
			}
		};
		car1.price();
		car1.mileage();
		car1.fuel();
	}

}

interface Car
{
	void fuel();
	void mileage();
	void price();
	
}
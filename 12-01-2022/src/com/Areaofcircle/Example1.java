package com.Areaofcircle;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) 
	{
                 /**
                  *    Write a java program to calculate the area of circle
                  *    
                  *    
                  *    
                  *    
                  *    Points:
                  *    1. use variables area, radius and Pi_value = 3.14
                  *    2. formula area = Pi_value*radius*radius
                  *    3. print the area value
                  *    
                  *    
                  *    
                  *    Note: use 'Scanner' class to read the values from keyboard.






                  * 
                  */

	double area=0.0;
	final double pi_value=3.14;
	double radious;
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the radious  :  ");
	radious=scanner.nextDouble();
	area=pi_value*radious*radious;
	System.out.println("*****************");
	System.out.println(area);
	scanner.close();
	
	}

}

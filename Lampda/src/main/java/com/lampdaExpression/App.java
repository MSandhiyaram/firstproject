package com.lampdaExpression;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	
    	/*
    	 * 85-100-->A
    	 * 70-85-->B
    	 * 55-70-->C
    	 * 40-45-->D
    	 * 
    	 * 
    	 * 
    	 */
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Enter the Percentage:  ");
    	double percentage=scan.nextDouble();
    	GradeCalc g=(per)->{
    		if((per>=85)&&(per<100))
    		{
    			return "A";
    		}
    		else if((per>=70)&&(per<85))
    		{
    			return "B";
    		}
    		else if((per>=55)&&(per<70))
    		{
    			return "C";
    		}
    		
    		else if((per>=40)&&(per<55))
    		{
    			return "D";
    		}
    		else
    		{
    			return "Fail";
    		}
    		
    		
    		
    	};
    	String result=g.grade(percentage);
    	System.out.println("The Grade is:"+result);
        
    }
}

interface GradeCalc
{
	String grade(double per);
	
}
package com.Areaofcircle;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) 
	{  
		/**
		 * 
		 * 
		 * (100+56-13%5+16/4+5%2)
		 * 100+56-3+16/4+1
		 * 100+56-3+4+1
		 * 156+1+1
		 * 158
		 */
		int exp=(100+56-13%5+16/4+5%2);
		System.out.println("value of exp is:  "+exp);
		
		System.out.println("**************************************");
		
		/**
		 * (17-8/4*2+3 - ++a)
		 * 17-8/4*2+3-6
		 * 17-2*2+3-6
		 * 17-4+3-6
		 * 13+3-6
		 * 16-6
		 * 10
		 *
		 * 
		 */
		int a=5;
		int exp1=(17-8/4*2+3 - ++a);
		
	    System.out.println("value of exp1 is :  "+exp1);
		
		
		
		
	
	}

}

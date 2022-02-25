package com.practiceQuestions;


//import java.io.File;
//import java.io.*;
//import java.io.IOException;
import java.util.Scanner;

//QUESTION 
/**
 * to create a class MyCalculator which consists of a single method long power(int, int). 
 * This method takes two integers, and, as parameters and finds Math.pow(n,p). 
 * - If either n or p is negative, 
 * then the method must throw an exception which says "n or p should not be negative.".
 * - If both n and p are zero, 
 * then the method must throw an exception which says "n and p should not be zero."
 * 
 * 
 */
class MyCalculator {
    /*
    * Create the method long power(int, int) here.
    */
    public long power(int n, int p) throws Exception
    {
        if(n == 0 && p == 0)
        {
            throw new Exception("n and p should not be zero.");
        }
        else if(n < 0 || p < 0)
        {
            throw new Exception("n or p should not be negative.");
        }
        else
        {
            return (long)(Math.pow(n,p));
        }
    }
    
}
 class Solution 
{
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) 
    {
        while (in .hasNextInt()) 
        {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try 
            {
                System.out.println(my_calculator.power(n, p));
            } 
            catch (Exception e) 
            {
                System.out.println(e);
            }
        }
    in.close();
  
    }
}

	
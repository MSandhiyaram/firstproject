package com.MultipleAsserts;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class MainTest 
{
	
	/**
	 * Unit test for simple App.
	 */
	
//	    /**
//	     * Rigorous Test :-)
//	     */
//	    @Test
//	    public void shouldAnswerWithTrue()
//	    {
//	        assertTrue( true );
//	    }
		
		public static void main(String args[])
		{
			Result result = JUnitCore.runClasses(CalculatorTest.class,TestCases.class);
			
	        for (Failure failure : result.getFailures()) {
	           System.out.println(failure.toString());
	        }
	        System.out.println(result.getRunCount());
	        System.out.println(result.getFailureCount()); 
	        System.out.println(result.getIgnoreCount());
	        System.out.println(result.wasSuccessful());
		}

	}


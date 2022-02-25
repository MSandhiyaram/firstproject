package com.stringHandling;

public class Example1 
{

	public static void main(String[] args) 
	{
		String str="EduBridge";
		
		System.out.println(str);
		System.out.println(str.length());//Length of str is 9
		System.out.println(str.charAt(0));//Index of 0 is E
		
		int len=str.length();
		//System.out.println(str.charAt(len));	//Exception in thread "main" 
		//java.lang.StringIndexOutOfBoundsException: String index out of range: 9
		
		System.out.println(str.substring(3));	//Its print after substring(3)
		System.out.println(str.substring(2,6));	//Its print Start with index(2) and end index is (6-1=5) i.e)its print [start,end-1] 
		System.out.println(str.contains("b")); //Works on case-sensitive . //Returen Boolean Values(True/False)
		System.out.println(str.isEmpty()); 	//The str having a value. Not Empty. //Return Boolean Values(True/False) 
		
		
		String str1="";
		System.out.println(str1.isEmpty()); //returns boolean values(True/False)
		
		System.out.println(str.concat(" India"));
		
		str=str.concat(" India");
		
		//append will not create a new String rather in case of concat new String needs to be created
		
		//String str2="edubridge";
		System.out.println(str.equals("edubridge")); //Returns a Boolean Values(True/False)
		
		System.out.println(str.equalsIgnoreCase("edubridge")); //Returns a Boolean Values(True/False)
		
	}

}

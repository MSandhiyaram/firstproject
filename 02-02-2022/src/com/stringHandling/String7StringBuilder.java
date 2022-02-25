package com.stringHandling;

import java.lang.*;

public class String7StringBuilder 
{

	public static void main(String[] args) 
	{
		// StringBuilder
		// ->it is mutable(changeable)
		//StringBuffer

		//Both the classes are same except one difference that StringBuilder is non-synchronized whereas StringBuffer is synchronized
		//Synchronization : when two activities/operations occurs at same time that process is referred as Synchronization
		//Synchronization in java : when multiple threads tries to access the same resource.

		StringBuilder sb=new StringBuilder();
		System.out.println(sb.capacity());	//number of characters that the StringBuilder can have
		sb.append("Hey!");
		System.out.println(sb);
		sb.append("I am working ");
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.ensureCapacity(200);//to allocate a specific amount of capacity to the instance.
		//ensureCapacity method can be used to increase the size of an object but cannot decrease the size.
		//new capacity=(old capacity*2)+2;
		System.out.println(sb);
		System.out.println(sb.capacity());
		//System.out.println(sb.isEmpty());
		//System.out.println(sb.length()==0);
		System.out.println(sb.indexOf("!"));
		System.out.println(sb.insert(3, " User"));
		//find the character at 8 position : index=(position-1)
		System.out.println("charAt(8): "+sb.charAt(8));
		System.out.println(sb.equals("Hey"));
		System.out.println("indexof (w,16): "+sb.indexOf("w", 12));
		System.out.println("o/p of lastIndexOf : "+sb.lastIndexOf("e"));
		System.out.println("o/p of lastIndexOf(e,7) : "+sb.lastIndexOf("e", 7));
		System.out.println("Length : "+sb.length());
		System.out.println("Substr : "+sb.substring(4, 10));
		//System.out.println("Reverse : "+sb.reverse());
		sb.trimToSize();
		System.out.println("Trimmed Capacity"+sb.capacity());
		System.out.println(sb);

		sb.setCharAt(0, 'h');//replacing the character at 0 index with h

		System.out.println("Value of SB : "+sb);

	}

}

package com.LinkedlistAndMethods;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Collection5LinkedList 
{

	public static void main(String[] args) 
	{
		
		Scanner snc=new Scanner(System.in);
		System.out.println("Enter size: ");
		int size=snc.nextInt();
		System.out.println("Enter "+size+" elements: ");
		
		
		
		LinkedList<Integer> ll=new LinkedList<Integer>();
		for(int i=0;i<size;i++)
		{
			ll.add(snc.nextInt());
		}
		snc.close();
		System.out.println("List in Elements: ");
		for(int i=0;i<ll.size();i++)
		{
			System.out.println(ll.get(i));
		}
		//System.out.println(ll);
		//Collections.sort(ll);
		System.out.println("Dcending Order");
		Collections.sort(ll);
		System.out.println(ll);

		
		System.out.println("Acending Order");
		Collections.sort(ll, Collections.reverseOrder());  
		System.out.println(ll);
		
		System.out.println("Repeated Elements");

	}

}

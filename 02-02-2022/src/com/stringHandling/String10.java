package com.stringHandling;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class String10 
{

	public static void main(String[] args) 
	{
		String str = "hello world";

		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < str.length(); i++) 
		{
			if (map.containsKey(str.charAt(i))) 
			{
				map.replace(str.charAt(i), map.get(str.charAt(i)) + 1);
			} else 
			{
				map.put(str.charAt(i), 1);
			}
		}

		System.out.println(map);


	}

}

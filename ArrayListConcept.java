package com.collection.framework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListConcept
{
	public static void main(String...args)
	{
		ArrayList<Integer> array=new ArrayList<>();
		
		array.add(19);
		array.add(56);
		array.add(89);
		System.out.println(array);
		array.remove(2);
		System.out.println(array);
		
		array.add(19);
		array.add(1,100);
		List<Integer> list=new ArrayList<>();
		
		list.add(90);list.add(80);list.add(70);list.add(60);
		
		System.out.println(array);
		
		array.addAll(list);
		
		System.out.println(array);
		array.addAll(1, list);
		
		System.out.println(array);
		
		array.add(null);
		array.add(null);
		System.out.println(array);
	
		System.out.println(array.get(10));
		array.set(5, null);
		System.out.println(array);
		
		System.out.println(array.indexOf(56));
		
	/*
	 * Default capacity if arraylist is 10
	 */
		
	}

}

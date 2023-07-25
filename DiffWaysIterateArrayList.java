package com.collection.framework;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;
public class DiffWaysIterateArrayList 
{
	public static void main(String...args)
	{
		List<String> list1=Arrays.asList("One","Five","ten","Fifteen");
		System.out.println("Iteration using normal for loop");
		//Normal for loop...
		for(int index=0;index<list1.size();index++)
		{
			System.out.println(list1.get(index));
		}
		System.out.println("Iteration using iterator object of iterator method");
		//Iterator object
		Iterator it=list1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			//it.remove();
		}
		System.out.println("Iteration using ListIterator object of listIterator()");
		//Iteration using ListIterator object
		System.out.println("FORWARD DIRECTION");
		ListIterator listIt=list1.listIterator();
		while(listIt.hasNext())
		{
			System.out.println(listIt.next());
		}
		System.out.println("REVERSE DIRECTION");
		while(listIt.hasPrevious())
		{
			System.out.println(listIt.previous());
		}
		System.out.println("Iteration using enhanced for loop");
		for(String element:list1)
		{
			System.out.println(element);
		}
	}

}

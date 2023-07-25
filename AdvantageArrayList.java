package com.collection.framework;

import java.util.ArrayList;
import java.util.ListIterator;

public class AdvantageArrayList 
{
	/*
	 * resizeable
	 * add remove element
	 * contains duplicate and null
	 * manipulate the element by indexOf lastIndexOf..
	 * 
	 * 
	 */
	public static void main(String...args)
	{
	String[] str=new String[1000];
	long start=System.currentTimeMillis();
	
	for(int index=0;index<1000;index++)
	{
	  str[index]="Number: "+index;
	}
	long end=System.currentTimeMillis();
	System.out.println(start-end);
	
	
	
	ArrayList<String> arr=new ArrayList<String>();
	 start=System.currentTimeMillis();
	for(int index=0;index<10;index++)
	{
		arr.add("name"+index);
	}
	end=System.currentTimeMillis();
	
	//System.out.println(start-end);
    
	ListIterator lists=arr.listIterator();
	
	while(lists.hasNext())
	{
		System.out.println(lists.next());
	}
	while(lists.hasPrevious())
	{
		System.out.println(lists.previous());
	}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

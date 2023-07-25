package com.collection.framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayList 
{
	//sort(List)   ordered by natural 
	//sort(list,comparator)sorts the element according to specified comparator
	
	public static void main(String...args)
	{
		List<String> list=new ArrayList<>();
		list.add("rain");list.add("heat");list.add("cool");list.add("ashwini");
		list.add("yalini");
		Collections.sort(list);
		System.out.println(list);
		
		
		List<String> list1=new ArrayList<>();
		list1.add("rain");list1.add("Heat");list1.add("cool");list1.add("ashwini");
		list1.add("yalini");
		Collections.sort(list1,String.CASE_INSENSITIVE_ORDER);
		System.out.println(list1);
	}
	
	/*
	 * sort(list)
	 * sort(list,String.CASE_INSENSITIVE_ORDER)
	 * sort(list)
	 * sort(list,Comparator)
	 * 
	 */

}

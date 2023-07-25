package com.collection.framework;

import java.util.ArrayList;

public class ModifyArrayList
{
	public static void main(String...args)
	{
		ArrayList<String> list=new ArrayList<>();
		list.add("One");
		list.add("Two");
		list.add("three");list.add("four");list.add("five");
		System.out.println(list);
		list.add(1, "ZERO");
		list.add(0,"Inserted");
		System.out.println(list);
		list.remove("ZERO");
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		list.set(0, "HUNDRED");
		System.out.println(list);
		
		ArrayList<String> list2=new ArrayList<>();
		list2.add("Mango");list2.add("Grapes");list2.add("Orange");
		System.out.println(list2);
		list.addAll(list2);
		System.out.println(list);
		list.removeAll(list2);
		System.out.println(list);
	}

}

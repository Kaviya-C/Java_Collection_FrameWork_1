package com.collection.framework;

import java.util.ArrayList;

public class ArrayListMethods {
	/*
	 * there are three ways arraylist constructor
	 * 
	 * new ArrayList()--default initial capacity is 10 ArrayList(initialCapacity)--
	 * creates an empty array list with passing initial capacity
	 * ArrayList(Collection c)
	 */
	public static void main(String... args) {
		ArrayList<Integer> arr1 = new ArrayList<>();

		ArrayList<Integer> arr2 = new ArrayList<>(20);

		ArrayList<Integer> arr3 = new ArrayList<>(arr1);

		// How do you increase the current capacity?
		ArrayList<Integer> arr4 = new ArrayList<>();
		arr4.ensureCapacity(30);
		// How do u decrease the current capacity of an arraylist to the current size?
		ArrayList<Integer> arr5 = new ArrayList<>();
		arr5.ensureCapacity(20);
		arr5.add(100);
		arr5.add(90);
		arr5.add(80);
		arr5.add(70);
		arr5.trimToSize();// --decrease the current capacity to current size
		System.out.println(arr5.size());
		// no of elements present in array
		arr1.add(124);
		arr1.add(234);
		arr1.add(456);
		arr1.add(678);
		arr1.add(890);
		System.out.println("Array! :1" + arr1.size());
		// whether arraylist is empty or not
		System.out.println("Array: 2: " + arr2.isEmpty());
		System.out.println("Size: " + arr2.size());

		// whether the element is present or not in arraylist
		ArrayList<String> arr6 = new ArrayList<>();

		arr6.add("ram");
		arr6.add("seetha");
		arr6.add("vinay");
		arr6.add("seetha");
		arr6.add("bhuvana");
		System.out.println("String there or not: " + arr6.contains("ram"));

		// get the position of particular element:

		System.out.println("Index: " + arr6.lastIndexOf("seetha"));

		Object[] str = arr6.toArray();
		for (Object o : str) {
			System.out.println(o);
		}
		// retrieve element from a particular position

		System.out.println(arr6.get(4));
		arr6.set(4, "kavi");
		System.out.println(arr6);
		arr6.set(0, "janu");
		System.out.println(arr6);

		// insert an element at particular postion

		arr6.add(0, "geetha");
		System.out.println(arr6);
		arr6.remove(1);
		System.out.println(arr6);
		arr6.remove("geetha");
		System.out.println(arr6);
		System.out.println("Before clearing: " + arr1);
		arr1.clear();
		System.out.println("After clearing: " + arr1);

		System.out.println("SubList: " + arr6.subList(0, 1));

		ArrayList<String> arr7 = new ArrayList<>();
		arr7.add("jay");
		arr7.add("prathab");
		arr7.add("reena");

		System.out.println(arr6.addAll(arr7));
		System.out.println(arr6);
		System.out.println(arr7);
		arr7.addAll(0, arr6);
		System.out.println(arr7);

	}

}

package com.collection.framework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
/*
 * HashSet---->insertion order is erased
 * LinkedHashSet--->insertion order is not erased
 * 
 */
public class RemoveDupALUseHashSet {
	public static void main(String... args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Java");
		list1.add("JDBC");
		list1.add("Job");
		list1.add("Software");
		list1.add("JDBC");
		list1.add("developer");
		
		list1.add("Java");
		System.out.println("Before removing duplicates: " + list1);

		System.out.println("With duplicates: " + list1);

		Set<String> set = new HashSet<>(list1);
		System.out.println("Without duplicates in set: " + set);

		ArrayList<String> result = new ArrayList<>(set);
		System.out.println("after removing duplicates: " + result);

		Set<String> linked = new LinkedHashSet<>(list1);
		System.out.println("Linked hashSet: " + linked);

	}

}

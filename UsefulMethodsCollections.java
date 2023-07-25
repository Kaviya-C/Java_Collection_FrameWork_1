package com.collection.framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class UsefulMethodsCollections {
	public static void main(String... args) {

		List<String> source = new ArrayList<>();
		source.add("apple");
		source.add("two");
		List<String> target = new ArrayList<>(Collections.nCopies(source.size(), ""));
		target.add("kavii");
		Collections.copy(target, source);
		System.out.println("Source List: " + source);
		System.out.println("Target List: " + target);

		List<Integer> sourceList = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> targetList = new ArrayList<>(Collections.nCopies(sourceList.size(), 0));
		Collections.copy(targetList, sourceList);
		System.out.println("Source List: " + sourceList);
		System.out.println("Target List: " + targetList);

		int count = 3;
		String element = "kaviya";
		List<String> result = new ArrayList<>(Collections.nCopies(count, element));
		result.add("oviya");
		System.out.println(result);

		List<String> source1 = Arrays.asList("java", "JDBC", "java", "JPA", "JDBC", "JDBC");
		int frequency = Collections.frequency(source1, "JDBC");
		int freq1 = Collections.frequency(source1, "java");
		System.out.println("Frequency of JDBC is: " + frequency);
		System.out.println("Frequency of Java is: " + freq1);

		List<Integer> l1 = Arrays.asList(9, 10, 34, 2, 7, 40);
		int maximum = Collections.max(l1);
		System.out.println("Maximum element: " + maximum);
		int min = Collections.min(l1);
		System.out.println("Minimum element: " + min);
		System.out.println("Before replacing: " + l1);
		Collections.replaceAll(l1, 9, 100);
		System.out.println("after replacing: " + l1);
		Collections.sort(l1);
		System.out.println("After sorting: " + l1);

		Collection<String> collection = new ArrayList<>();
		Collection<String> syncCollection = Collections.synchronizedCollection(collection);

		/*
		 * Collections ---reverse()==list ---copy()---target,source ---ncopies(int
		 * no,element); --max(list) --min(list) --replaceAll(list,oldValue,newValue);
		 * --sort(list); --frequency(list,element)--int
		 * 
		 */

	}

}

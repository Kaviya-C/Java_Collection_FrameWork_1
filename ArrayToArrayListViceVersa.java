package com.collection.framework;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;

public class ArrayToArrayListViceVersa {
	
	public static void main(String... args) {
		String[] str1 = new String[] { "Ram", "Seetha", "Oviya" };

		// Arrays.asList(array);--first method

		ArrayList<String> list = new ArrayList<String>(Arrays.asList(str1));

		System.out.println(list);

		// second method: Collections.addAll(arraylist,array);

		String[] str2 = new String[] { "mango", "fruit", "apple", "orange" };
		ArrayList<String> list2 = new ArrayList<>();
		Collections.addAll(list2, str1);
		System.out.println(list2);

		// Third method ArrayList.addAll(array);

		String[] str3 = new String[] { "jasmine", "rose", "lotus", "lily" };
		ArrayList<String> list3 = new ArrayList<>();
		list3.addAll(Arrays.asList(str3));
		System.out.println(list3);

		// fourth method java-8 Stream

		String[] str4 = new String[] { "long", "short", "brief", "mild", "length" };
		List<Object> list4 = Arrays.stream(str4).collect(Collectors.toList());
		System.out.println(list4);

		// ArrayList to Array
		ArrayList<Integer> list5 = new ArrayList<>();
		list5.add(12);
		list5.add(24);
		list5.add(34);
		list5.add(46);
		Integer[] array = new Integer[list5.size()];
		list5.toArray(array);
		for (Integer element : array) {
			System.out.println(element);
		}

	}

}
/*
 * Array | ArrayList<>(Arrays.asList())
 * 
 * Array | ArrayList<>()--->Collections.addAll(arrayList,array);
 * 
 * Array | ArrayList<>()----arrayList.addAll(Collection)
 *                      ----arrayList.addAll(Arrays.asList(array));
 *                         
 * List<Object>()----Arrays.stream(array).collect(Collectors.toList()); 
 * 
 * ArrayList to Array
 * arrayList.toArray(array);
 * 
 * 
 */

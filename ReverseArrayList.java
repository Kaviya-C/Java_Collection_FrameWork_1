package com.collection.framework;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
	public static void main(String... args) {
		ArrayList<Integer> array = new ArrayList<>();
		array.add(10);
		array.add(20);
		array.add(30);
		array.add(40);
		System.out.println("before reversing an arraylist:  ");
		System.out.print(array + " ");
		System.out.println();
		System.out.println("After reverseing an arraylist: ");
		Collections.reverse(array);
		System.out.println(array + " ");

		LinkedList<String> link = new LinkedList<>();
		link.add("orange");
		link.add("mango");
		link.add("apple");
		System.out.println("Before reversing: ");
		System.out.print(link + " ");
		System.out.println();
		System.out.println("After reversing: ");
		Collections.reverse(link);
		System.out.print(link + " ");

	}

}

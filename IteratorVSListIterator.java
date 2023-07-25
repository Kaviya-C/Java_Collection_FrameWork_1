package com.collection.framework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class IteratorVSListIterator {
	public static void main(String... args) {
		List<String> list = new ArrayList<>();
		list.add("tree");
		list.add("peacock");
		list.add("goat");
		list.add("cow");
		list.add("bird");
		list.add("Water");

		System.out.println("------List--------");
		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			it.remove();
			System.out.println("Next: " + it.next());
		}

		System.out.println("------------Set---------");
		Set<String> set = new HashSet<>();
		set.add("Phone");
		set.add("laptop");
		set.add("switch");
		set.add("keypad");
		System.out.println(set);
		Iterator it1 = set.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());

		}
		System.out.println("---------Queue---------");
		Queue<String> queue = new PriorityQueue<>(list);
		Iterator it2 = queue.iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}

		ListIterator lit = list.listIterator();
		while (lit.hasNext()) {
			System.out.println("IndexNUMBER: " + lit.nextIndex() + " " + "Element " + lit.next());
		}

		// ListIterator sit=set.listIterator();
		// ListIterator qit=queue.listIterator();
		// ----------compile time error-----------
		// listIterator not applicable for set and queue

		ListIterator<String> lit1 = list.listIterator();

		while (lit1.hasNext()) {
			System.out.println("IndexNUMBER: " + lit1.nextIndex() + " " + "Element " + lit1.next());
			// lit1.next();
			lit1.set("NEW modification");
			lit1.add("kaviya");

		}
		System.out.println(list);

		ListIterator<String> lit2 = list.listIterator(3);
		while (lit2.hasNext()) {
			System.out.println("IndexNUMBER: " + lit2.nextIndex() + " " + "Element " + lit2.next());
		}

	}

}

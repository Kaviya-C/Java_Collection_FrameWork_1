package com.collection.framework;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class VectorConcept {
public static void main(String...args)
{
	Vector<Integer> vector=new Vector<>(3);
	System.out.println(vector.capacity());
	vector.setSize(10);
	vector.add(100);
	vector.add(90);
	vector.add(80);
	vector.add(70);
	//vector.ensureCapacity(20);
	System.out.println(vector.capacity());
	System.out.println(vector);
	
	ArrayList<Integer> list=new ArrayList<Integer>();
	list.add(22);list.add(33);list.add(55);
	Enumeration<Integer> en=vector.elements();
	while(en.hasMoreElements())
	{
		
		System.out.println(en.nextElement());
	}
	System.out.println(vector.firstElement());
	System.out.println(vector.lastElement());
	System.out.println(vector.lastIndexOf(80));
	
}
}

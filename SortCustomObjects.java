package com.collection.framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparable<Student>
{
	int id;String name; int percent;
	
	public Student(int studId,String studName,int studPer)
	{
		this.id=studId;
		this.name=studName;
		this.percent=studPer;
	}
	@Override
	public int compareTo(Student s)
	{
		//return this.id-s.id;
		System.out.println(s.id);
		System.out.println(this.id);
		return this.id-s.id;
		//1-9==-8
		//9  , 1
	}
	@Override
	public String toString()
	{
		return +id+" "+name+" "+percent+" ";
	}	
}
class OrderByPercentage implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o2.percent-o1.percent;
	
	
	
	}
	
}
public class SortCustomObjects 
{
	public static void main(String...args)
	{
//		ArrayList<Student> list=new ArrayList<>();
//		list.add(new Student(1,"kaviya",78));
//		list.add(new Student(3,"Radha",86));
//		list.add(new Student(4,"Yash",89));
//		list.add(new Student(8,"Krishna",98));
//		list.add(new Student(6,"raman",48));
//		list.add(new Student(5,"mano",98));
//		//System.out.println("---> "+list);
//		Collections.sort(list,new OrderByPercentage());
//		System.out.println(list);
		
		
		ArrayList<Student> list1=new ArrayList<>();
		list1.add(new Student(1,"kaviya",78));
		list1.add(new Student(9,"Radha",86));
//		list1.add(new Student(6,"Yash",89));
//		list1.add(new Student(10,"Krishna",98));
//		list1.add(new Student(3,"raman",48));
//		list1.add(new Student(5,"mano",98));
		
		Collections.sort(list1,Collections.reverseOrder());
		System.out.println(list1);

		//Collections    sort---internal comparable-- compareTo(object a)
		//               sort(list,Comparator)===comparator--compare(Object o,Object o1)
		
	}

}

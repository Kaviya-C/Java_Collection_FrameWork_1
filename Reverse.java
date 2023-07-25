package com.collection.framework;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//comparator---compare--2 object argument--- -1 swap +1 no swap 0 
//comparable--compareTo---one object argument
public class Reverse
{
	public static void main(String...args)
	{
		List<Integer> array=Arrays.asList(10,99,99,100);
		Collections.sort(array);
		System.out.println(array);
		Collections.sort(array,Collections.reverseOrder());
	    System.out.println(array);
	  List<String> list=Arrays.asList("Oviya","Pranav","geetha","ilayan");
	  Collections.sort(list);
	  System.out.println(list);
	  Collections.sort(list,String.CASE_INSENSITIVE_ORDER);
	  System.out.println(list);
	
	}

}

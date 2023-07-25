package com.collection.framework;

public class ListInterface
{
	/*
	 * List is an interface
	 * it is ordered or sequential list of objects
	 * ArrayList Vector LinkedList all implements List interface
	 * 
	 * List contains duplicate elements
	 * List contains multiple null elements
	 * we can access the elements by using index
	 * we can insert the element using index and then elements are moved to right
	 * we can remove the specific element by using index
	 * iterable---->Collection---->List
	 * iterator()----14 methods---->9 methods
	 * 
	 * List methods are:  
	 * get(Index)  
	 * set(index,element)
	 * void add(index,element)
	 * E remove(index)    
	 * int indexOf(Object)
	 * int lastIndexOf(Object)
	 * ListIterator <E> listIterator()
	 * ListIterator<E> listIterator(index)
	 * subList(startIndex ,EndIndex)
	 * 
	 * 
	 * Iterable--->Collection--->List---------------------------->ArrayList--implements RandomAccess
	 *  			 --abstaract Collection----abstract list			   --implements Cloneable
	 *  				    						 					   --implements Serializable
	 *   								
	 *   -------------------------------ArrayList-------------------------------------
	 *   
	 *   ArrayList is same as normal arrays
	 *   arrays--fixed in size and cant insert delete elements
	 *   
	 *   ArrayList can be resizeable-->we can insert remove elements
	 *   
	 *   accessed using index start from 0 th index
	 *   contains duplicate elements
	 *   contains null elements
	 *   if we insert element middle then elements are move to right
	 *   if we remove element then all element are move to left
	 *   if we know the element then we can identify the position using indexOf
	 *   it implements random access so we can get set insert remove element from any arbitary positions  
	 * 
	 */
	
	public static void main(String...args)
	{
		
	}

}

package linkedlist;

import java.util.LinkedList;

/**
 * 
 * @author mmia01
 * Write a Java program to get the first and last elements of an array list
 *
 */

public class Ex09 {

	public static void main(String[] args) {

		// List1
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("White");
		ll.add("Green");
		ll.add("Blue");
		ll.add("Black");
		ll.add("Green");
		System.out.println(ll);
		
		// Get the first occurrence
		System.out.println("Value at the first index: " + ll.getFirst());

		// Get the last occurrence
		System.out.println("Value at the last index: " + ll.getLast());
		


		
	}

}

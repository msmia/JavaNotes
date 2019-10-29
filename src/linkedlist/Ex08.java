package linkedlist;

import java.util.LinkedList;

/**
 * 
 * @author mmia01
 * Write a Java program to insert some elements at the specified position into a linked list.
 *
 */

public class Ex08 {

	public static void main(String[] args) {

		// List1
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("White");
		ll.add("Green");
		System.out.println(ll);
		System.out.println("");

		// List2
		LinkedList<String> ll2 = new LinkedList<String>();
		ll2.add("Black");
		ll2.add("Purple");
		System.out.println(ll2);
		System.out.println("");

		// Add the values of list1 to list2 between index 1 and 2
		ll2.addAll(1, ll);
		System.out.println(ll2);

	}

}

package linkedlist;

import java.util.LinkedList;

/**
 * 
 * @author mmia01
 * Write a Java program to insert the specified element at the front of a linked list.
 *
 */

public class Ex06 {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();
		
		// Without casting

		ll.add("White");
		ll.add("Green");
		ll.add("Red");
		
		// at the front of the linkedlist
		ll.offerFirst("Black");
		

		System.out.println(ll);
	}

}

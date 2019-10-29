package linkedlist;

import java.util.LinkedList;

/**
 * 
 * @author mmia01
 * Write a Java program to insert the specified element at the end of a linked list.
 *
 */

public class Ex07 {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();
		
		// Without casting

		ll.add("White");
		ll.add("Green");
		ll.add("Red");
		System.out.println(ll);
		
		ll.addLast("Purple");
		System.out.println(ll);
	}

}

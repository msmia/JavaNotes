package linkedlist;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @author mmia01
 * Write a Java program to insert elements into the linked list at the first and last position
 *
 */

public class Ex05 {

	public static void main(String[] args) {

		List<String> ll = new LinkedList<String>();
		
		// Without casting
		
		ll.add("White");
		ll.add("Green");
		ll.add("Red");

		ll.add(0, "Orange"); // Without using List interface
		ll.add(ll.size(), "Purple"); // add in the end

		// With casting

		// cast the ll from List type to LinkedList type and access LinkedList's
		// functionalities
		((LinkedList<String>) ll).addFirst("Black");
		((LinkedList<String>) ll).addLast("Blue");

		System.out.println(ll);
	}

}

package linkedlist;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @author mmia01
 * Write a Java program to insert the specified element at the specified position in the linked list.
 *
 */

public class Ex04 {

	public static void main(String[] args) {

		List<String> ll = new LinkedList<String>();

		ll.add("White");
		ll.add("Green");		
		ll.add("Red");
		
		ll.add(0, "Black");
		
		System.out.println(ll);
	}

}

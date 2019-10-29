package linkedlist;

import java.util.LinkedList;

/**
 * 
 * @author mmia01
 * Write a Java program to display the elements and their positions in a linked list
 *
 */

public class Ex11 {

	public static void main(String[] args) {

		// List1
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("White");
		ll.add("Green");
		ll.add("Blue");
		ll.add("Black");
		ll.add("Green");
		System.out.println(ll);
		
		//Remove with object/string
		ll.remove("Green");
		System.out.println(ll);
		
		//Remove with index
		ll.remove(1);
		System.out.println(ll);
		
		// Remove first
		ll.removeFirst();
		System.out.println(ll);
				
		// Remove last
		ll.removeLast();
		System.out.println(ll);
		
		// Remove all
		ll.removeAll(ll);
		System.out.println(ll);
		
	}

}

package linkedlist;

import java.util.LinkedList;

/**
 * 
 * @author mmia01
 * Write a Java program to display the elements and their positions in a linked list
 *
 */

public class Ex10 {

	public static void main(String[] args) {

		// List1
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("White");
		ll.add("Green");
		ll.add("Blue");
		ll.add("Black");
		ll.add("Green");
		System.out.println(ll);
		
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(i + ": " + ll.get(i));
		}	
	}

}

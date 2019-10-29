package linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author mmia01 Write a Java program to clone an linked list to another linked
 *         list Write a Java program to remove and return the first element of a
 *         linked list.
 *
 */

public class Ex13 {

	public static void main(String[] args) {

		// List1
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("White");
		ll.add("Green");
		ll.add("Blue");
		ll.add("Black");
		ll.add("Green");
		System.out.println("Before shuffling: " + ll);

		// Shuffle the linkedlist
		Collections.shuffle(ll);
		System.out.println("After shuffling: " + ll);

		// Get the first element of the linked list but don't remove it
		// ============================================================

		System.out.println(ll.peek());
		System.out.println(ll);

		System.out.println(ll.element());
		System.out.println(ll);

		System.out.println(ll.remove());
		System.out.println(ll);

		System.out.println(ll.poll());
		System.out.println(ll);

		// convert hashmap to list
		Map<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "value0");
		hm.put(1, "value1");
		hm.put(2, "value2");

		List<String> l = new ArrayList<String>(hm.values());
		System.out.println("l: " + l);

		// Get unique values of an arraylist

		LinkedList<String> ll2 = new LinkedList<String>();
		ll2.add("White");
		ll2.add("Green");
		ll2.add("Blue");
		ll2.add("Black");
		ll2.add("Green");
		
		System.out.println(ll.containsAll(ll2));
		
		ll2.set(1, "Yellow");
		System.out.println(ll2);
		
	}

}

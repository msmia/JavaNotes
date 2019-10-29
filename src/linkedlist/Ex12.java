package linkedlist;

import java.util.Collections;
import java.util.LinkedList;

/**
 * 
 * @author mmia01
 * Write a Java program to display the elements and their positions in a linked list
 *
 */

public class Ex12 {

	public static void main(String[] args) {

		// List1
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("White");
		ll.add("Green");
		ll.add("Blue");
		ll.add("Black");
		ll.add("Green");
		System.out.println("Before shuffling: "+ll);
		
		// Shuffle the linkedlist
		Collections.shuffle(ll);
		System.out.println("After shuffling: "+ll);
		
		
		// Add a list to an existing list
		//===============================
		
		// List1
		LinkedList<String> ll2 = new LinkedList<String>();
		ll2.add("White1");
		ll2.add("Green1");
		ll2.add("Blue1");
		ll2.add("Black1");
		ll2.add("Green1");
		System.out.println("Before shuffling: "+ll2);
		
		ll.addAll(ll2);		
		System.out.println(ll);
		
		
		
		
		
	}

}

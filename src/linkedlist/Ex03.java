package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @author mmia01
 * Write a Java program to iterate a linked list in reverse order.  
 *
 */

public class Ex03 {

	public static void main(String[] args) {

		List<String> ll = new LinkedList<String>();

		ll.add("White");
		ll.add("Green");		
		ll.add("Red");

		//Way 1
		for (int i = ll.size() - 1; i >= 0; i--) {
			System.out.println(ll.get(i));
		}
		
		System.out.println("=======");
		
		// Way2
		Iterator<String> itr = ((LinkedList<String>)ll).descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}

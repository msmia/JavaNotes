package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @author mmia01
 * Write a Java program to iterate through all elements in a linked list
 *
 */

public class Ex02 {

	public static void main(String[] args) {

		List<String> ll = new LinkedList<String>();
		
		ll.add("White");
		ll.add("Red");
		ll.add("Green");
		
		//Way: 1
		ll.forEach(val -> System.out.println(val));		
		
		System.out.println("=========");
		
		//Way: 2
		Iterator<String> itr = ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("=========");
		
		//Way: 3
		for (String v : ll) {
			System.out.println(v);
		}
		
		System.out.println("=========");
		
		//Way: 4
		for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
		
		
	}

}

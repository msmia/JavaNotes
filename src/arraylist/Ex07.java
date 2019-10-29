package arraylist;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author mmia01 
 * Write a Java program to sort a given array list.
 */

public class Ex07 {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();

		al.add("White");
		al.add("Blue");
		al.add("Green");
		al.add("Yellow");

		System.out.println("Before sort: "+al);
		
		// Sort
		Collections.sort(al);
		
		System.out.println("After sort: "+al);

	}
}

package arraylist;

import java.util.ArrayList;

/**
 * @author mmia01 
 * Write a Java program to remove the third element from a array list
 */

public class Ex06 {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();

		al.add("White");
		al.add("Blue");
		al.add("Green");
		al.add("Yellow");

		// print all the elements
		System.out.println(al);
		
		// Remove the third element
		al.remove(2);
		
		// print all the elements - green should be gone from the list.
		System.out.println(al);


	}
}

package arraylist;

import java.util.ArrayList;

/**
 * @author mmia01 Write a Java program to test an array list is empty or not.
 */

public class Ex17 {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();

		al.add("White");
		al.add("Blue");
		al.add("Green");
		al.add("Yellow");

		// check al arraylist is empty or not before making the arraylist empty
		System.out.println(al.isEmpty() ? "Arraylist is empty" : "Arraylist isn't empty");

		// Remove all the values
		al.removeAll(al);
		System.out.println("Emptying the arraylist");

		// check al arraylist is empty or not after making the arraylist empty
		System.out.println(al.isEmpty() ? "Arraylist is empty" : "Arraylist isn't empty");

	}
}

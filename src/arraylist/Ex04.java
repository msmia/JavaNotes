package arraylist;

import java.util.ArrayList;

/**
 * @author mmia01 
 * Write a Java program to retrieve an element (at a specified
 * index) from a given array list.
 */

public class Ex04 {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();

		al.add("White");
		al.add("Blue");
		al.add("Green");
		al.add("Yellow");

		System.out.println(al.get(1));
		System.out.println(al.get(3));

	}
}

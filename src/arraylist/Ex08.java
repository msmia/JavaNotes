package arraylist;

import java.util.ArrayList;

/**
 * @author mmia01 
 * Write a Java program to search an element in a array list.
 */

public class Ex08 {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();

		al.add("White");
		al.add("Blue");
		al.add("Green");
		al.add("Yellow");

		// Use contains functionality to find if a value exists or not
		System.out.println(al.contains("Blue"));

	}
}

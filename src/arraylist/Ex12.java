package arraylist;

import java.util.ArrayList;

/**
 * @author mmia01 
 * Write a Java program to compare two array lists.
 */

public class Ex12 {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();

		al.add("White");
		al.add("Blue");
		al.add("Green");
		al.add("Yellow");
		
		ArrayList<String> al2 = new ArrayList<String>();

		al2.add("White");
		al2.add("Blue");
		al2.add("Green");
		al2.add("Yellow");		
		
		// extract a portion of the array list
		System.out.println(al.containsAll(al2));
	}
}

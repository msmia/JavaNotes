package arraylist;

import java.util.ArrayList;

/**
 * @author mmia01 
 * Write a Java program to reverse elements in a array list.
 */

public class Ex11 {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();

		al.add("White");
		al.add("Blue");
		al.add("Green");
		al.add("Yellow");
		
		// extract a portion of the array list
		System.out.println(al.subList(1, 3));
	}
}

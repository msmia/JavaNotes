package arraylist;

import java.util.ArrayList;

/**
 * @author mmia01 
 * Write a Java program to empty an array list.
 */

public class Ex16 {

	public static void main(String[] args) {
		
		// Adding two different arraylists into the third one

		ArrayList<String> al = new ArrayList<String>();

		al.add("White");
		al.add("Blue");
		al.add("Green");
		al.add("Yellow");
		
		// remove all the elements of the arraylist
		al.removeAll(al);
		
		// print the empty arraylist
		System.out.println(al);
	}
}

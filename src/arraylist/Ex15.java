package arraylist;

import java.util.ArrayList;

/**
 * @author mmia01 
 * Write a Java program to clone an array list to another array list
 */

public class Ex15 {

	public static void main(String[] args) {
		
		// Adding two different arraylists into the third one

		ArrayList<String> al = new ArrayList<String>();

		al.add("White");
		al.add("Blue");
		al.add("Green");
		al.add("Yellow");
		
		// Add all the elements of al arraylist to al2 arraylist.
		// add a new value to al2 arraylist.
		ArrayList<String> al2 = new ArrayList<String>(al);
		
		al2.add("1");
		
		// Print the new arraylist
		System.out.println(al2);
		
	}
}

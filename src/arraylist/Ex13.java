package arraylist;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author mmia01 
 * Write a Java program to compare two array lists.
 */

public class Ex13 {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();

		al.add("White");
		al.add("Blue");
		al.add("Green");
		al.add("Yellow");
		
		// Swapping white with Blue and Blue with White
		Collections.swap(al, 0, 1);
		
		// extract a portion of the array list
		System.out.println(al);
	}
}

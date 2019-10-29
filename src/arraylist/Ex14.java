package arraylist;

import java.util.ArrayList;

/**
 * @author mmia01 
 * Write a Java program to join two array lists
 */

public class Ex14 {

	public static void main(String[] args) {
		
		// Adding two different arraylists into the third one

		ArrayList<String> al = new ArrayList<String>();

		al.add("White");
		al.add("Blue");
		al.add("Green");
		al.add("Yellow");
		
		ArrayList<String> al2 = new ArrayList<String>();

		al.add("1");
		al.add("2");
		al.add("3");
		al.add("4");
		
		ArrayList<String> al3 = new ArrayList<String>();
		al3.addAll(al);
		al3.addAll(al2);
		
		System.out.println(al3);
		
	}
}

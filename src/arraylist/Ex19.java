package arraylist;

import java.util.ArrayList;

/**
 * @author Write a Java program to replace the second element of a ArrayList with the specified element
 */

public class Ex19 {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();

		al.add("White");
		al.add("Blue");
		al.add("Green");
		al.add("Yellow");
		
		// change the second element of the arraylist with the last element of the arraylist
		
		al.set(1, al.get(al.size()-1));

		System.out.println(al);
	}
}

package arraylist;

import java.util.ArrayList;

/**
 * @author Write a Java program to increase the size of an array list.
 */

public class Ex18 {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>(1);

		al.add("White");
		al.add("Blue");
		al.add("Green");
		al.add("Yellow");
		al.add("Yellow");
		al.add("Yellow");
		al.add("Yellow");
		al.add("Yellow");
		al.add("Yellow");
		al.add("Yellow");
		al.add("Yellow");
		al.add("Yellow");
		
		al.ensureCapacity(100);
		al.add("Yellow");
		al.add("Yellow");
		al.add("Yellow");
		al.add("Yellow");
		al.add("Yellow");
		al.add("Zero");

		
		System.out.println(al);
	}
}

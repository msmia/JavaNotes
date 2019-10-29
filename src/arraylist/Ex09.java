package arraylist;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author mmia01 
 * Write a Java program to copy one array list into another.
 */

public class Ex09 {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();

		al.add("White");
		al.add("Blue");
		al.add("Green");
		al.add("Yellow");

		ArrayList<String> al2 = new ArrayList<String>();

		al2.add("1");
		al2.add("2");
		al2.add("3");
		al2.add("4");
		
		Collections.copy(al2, al);
		
		System.out.println(al);
		System.out.println(al2);
		
	}
}

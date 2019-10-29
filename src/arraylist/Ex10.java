package arraylist;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author mmia01 
 * Write a Java program to shuffle elements in a array list. 
 */

public class Ex10 {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();

		al.add("White");
		al.add("Blue");
		al.add("Green");
		al.add("Yellow");

		System.out.println(al);
		
		Collections.shuffle(al);
		
		System.out.println(al);
	}
}

package arraylist;

import java.util.ArrayList;

/**
 * @author mmia01 
 * Write a Java program to update specific array element by given element.
 */

public class Ex05 {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();

		al.add("White");
		al.add("Blue");
		al.add("Green");
		al.add("Yellow");

		// print second element
		System.out.println(al.get(1));
		
		// change the value of the second element to Grey.
		al.set(1, "Grey");
		
		// print out the modified value
		System.out.println(al.get(1));


	}
}

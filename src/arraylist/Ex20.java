package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Write a Java program to replace the second element of a ArrayList
 *         with the specified element
 */

public class Ex20 {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();

		al.add("White");
		al.add("Blue");
		al.add("Green");
		al.add("Yellow");

		// 1
		for (String elem : al) {
			System.out.println(elem);
		}

		System.out.println("======");

		// 2
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

		System.out.println("======");

		// 3
		al.forEach(val -> System.out.println(val));

		System.out.println("======");

		// 4
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}

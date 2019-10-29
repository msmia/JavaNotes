package treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class Ex01 {

	public static void main(String[] args) {

		// Create a treeset instance
		TreeSet<String> ts = new TreeSet<String>();
		// add some values to treeset
		ts.add("val1");
		ts.add("val2");
		ts.add("val3");
		ts.add("val4");
		ts.add("val6");
		ts.add("val5");

		System.out.println("Printing treeset: " + ts);

		// Iterate thorugh all elements of a tree set
		ts.forEach(v -> System.out.println(v));
		System.out.println("===");

		// Add all the elements of a treeset to another tree set
		TreeSet<String> ts2 = new TreeSet<String>(ts);
		System.out.println(ts2);
		System.out.println("===");

		// reverse all the elements of a treeset then loop and print them
		Iterator<String> itr = ts2.descendingIterator();
		itr.forEachRemaining(v -> System.out.println(v));
		System.out.println("===");

		// Write a Java program to find the numbers less than 7 in a tree set
		TreeSet<Integer> ts3 = new TreeSet<Integer>();
		ts3.add(1);
		ts3.add(2);
		ts3.add(3);
		ts3.add(4);
		ts3.add(5);
		ts3.add(6);
		ts3.add(7);
		ts3.add(8);

		// headSet return all the integers less than the number is provided
		TreeSet<Integer> nums1 = (TreeSet<Integer>) ts3.headSet(7);
		System.out.println("Return all the integers less than 7: " + nums1);

		// tailSet returns all the integers greater than the number provided.
		// false will remove 7 from the list. Remove "false" if you want to see 7 in the result
		TreeSet<Integer> nums2 = (TreeSet<Integer>) ts3.tailSet(7, false); 
		System.out.println("Return all the integers greater than 7: " + nums2);

		// Print the first number that is less than 7 from the treeset
		System.out.println("First number that is less than 7: " + ts3.lower(7));

		// Print the first number that is less than 7 from the treeset
		System.out.println("First number that is less than 7: " + ts3.higher(7));

		// remove the first element of the treeset
		ts3.pollFirst();
		System.out.println("Remove the first element: "+ts3);

		// remove the last element of the treeset
		ts3.pollLast();
		System.out.println("Remove the last element: " + ts3);
		
		// Remove a given element from the treeset
		ts3.remove(4);
		System.out.println("Number 4 should be removed: " + ts3);

	}

}

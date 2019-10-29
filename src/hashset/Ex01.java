package hashset;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex01 {

	public static void main(String[] args) {

		// Create a hashset instance
		HashSet<String> hs = new HashSet<String>();
		// add some values to hashset
		hs.add("val1");
		hs.add("val2");
		hs.add("val3");
		hs.add("val4");
		hs.add("val6");
		hs.add("val5");

		// loop through each value of the hashset. note:
		// hashset doesn't maintain order
		hs.forEach(v -> System.out.println(v));
		System.out.println("===");

		// Create a treeset and add all the values of hashset and loop thorugh.
		// Note: treeset maintains insertion order
		Set<String> ts = new TreeSet<String>(hs);
		
		// Loop thorugh each element of the treeset
		ts.forEach(v -> System.out.println(v));

		// Empty a hashset
		hs.removeAll(hs);
		System.out.println(hs);

	}

}

package collectionPractices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
  @author mmia01 <br>
  
  @Challenge Multiple lists into one map <br>
  @ExpectedResult
{ <br>
	emirates4=[30.000004, -90.132459], <br>
	emirates3=[30.000003, -90.132458], <br>
	emirates2=[30.000002, -90.132457], <br>
	emirates1=[30.000001, -90.132456] <br>
} <br>
*/
public class MultipleListsToMap_1 {

	public static void main(String[] args) {
		
		List<String> l1 = new ArrayList<String>();
		l1.add("30.000001");
		l1.add("-90.132456");
		
		List<String> l2 = new ArrayList<String>();
		l2.add("30.000002");
		l2.add("-90.132457");
		
		List<String> l3 = new ArrayList<String>();
		l3.add("30.000003");
		l3.add("-90.132458");
		
		List<String> l4 = new ArrayList<String>();
		l4.add("30.000004");
		l4.add("-90.132459");
		
		Map<String, List<String>> ml2 = new HashMap<String, List<String>>();
		ml2.put("emirates1", l1);
		ml2.put("emirates2", l2);
		ml2.put("emirates3", l3);
		ml2.put("emirates4", l4);
		System.out.println("Unsorted:");
		System.out.println(ml2);
		
		// Sorted
		System.out.println("\nSorted: ");
		Map<String, List<String>> treeMap = new TreeMap<String, List<String>>(ml2);
		for(Entry<String, List<String>> l : treeMap.entrySet()) {
			System.out.println(l);
		}
		
		
		
	}

}


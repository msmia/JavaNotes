package collectionPractices;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfMapOfStrings {

	public static void main(String[] args) {

		Map<String,String> map1 = new HashMap<String, String>();
		map1.put("a", "A");
		map1.put("b", "B");
		map1.put("c", "C");
		
		Map<String,String> map2 = new HashMap<String, String>();
		map2.put("a", "A");
		map2.put("b", "B");
		map2.put("c", "C");
		
		List<Map<String,String>> ml = new ArrayList<Map<String,String>>();
		ml.add(map1);
		ml.add(map2);
		
		System.out.println(ml);
		
		
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
		
		System.out.println(ml2);
		



		
	}
}

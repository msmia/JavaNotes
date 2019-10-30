package hashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * HashMap useful functionalities
 * 
 * @author mmia01
 *
 */

public class Ex01 {

	public static void main(String[] args) {

		HashMap<String, String> hm1 = new HashMap<String, String>();

		hm1.put("c1", "White");
		hm1.put("c2", "Black");
		hm1.put("c3", "Green");
		hm1.put("c4", "Blue");
		hm1.put("c5", "Yellow");

		// Print all the keys
		System.out.println("Keys: " + hm1.keySet());
		System.out.println("===");

		// Print all the values
		System.out.println("Values: " + hm1.values());
		System.out.println("===");

		// Print the size of a map
		System.out.println(hm1.size());
		System.out.println("===");

		//
		HashMap<String, String> hm2 = new HashMap<String, String>();

		hm2.put("d1", "White1");
		hm2.put("d2", "Black2");
		hm2.put("d3", "Green3");
		hm2.put("d4", "Blue4");
		hm2.put("d5", "Yellow5");

		hm2.putAll(hm1);
		System.out.println("hm2: " + hm2);
		System.out.println("===");

		// Print a specific key value from the map
		System.out.println(hm1.get("c1"));
		System.out.println(hm1.get("c5"));
		System.out.println("===");

		// Loop through each key,value pair from hm2
		// Create Set view of the map
		Set<String> hm2keys = hm2.keySet();
		Iterator<String> itr1 = hm2keys.iterator();
		while (itr1.hasNext()) {
			System.out.println(hm2.get(itr1.next()));
		}
		System.out.println("===");
		
		// Check if the map is empty or not
		System.out.println("Is the hm2 map empty: "+hm2.isEmpty());
		System.out.println("===");
		
		// check if a key exists in the map
		System.out.println("Does the key \"c1\" exist in the map: "+hm2.containsKey("c1"));
		System.out.println("===");
		
		// check if a value exists in the map
		System.out.println("Does the value \"White\" exist in the map: "+hm2.containsValue("White"));
		System.out.println("===");	
		
		// Get a list of the values from hm2 map and loop thorugh
		List<String> keyValues = new ArrayList<String>(hm2.values());
		keyValues.forEach(v -> System.out.println(v));
		System.out.println("===");
		
		// Empty the hm2 map
		hm2.clear();
		System.out.println(hm2);
		
		

	}

}

package treeMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/**
 * TreeMap useful functionalities
 * 
 * @author mmia01
 *
 */

public class Ex01 {

	/*
	 * HashMap: 
	 * 1. A HashMap contains values based on the key.
	 * 2. It contains only unique elements.
	 * 3. It may have one null key and multiple null values.
	 * 4. It maintains no order.
	 * 
	 * LinkedHashMap:
	 * 1. A LinkedHashMap contains values based on the key.
	 * 2. It contains only unique elements.
	 * 3. It may have one null key and multiple null values.
	 * 4. It is same as HashMap instead maintains insertion order.
	 * 
	 * TreeMap:
	 * 1. A TreeMap contains values based on the key. It implements the
	 * NavigableMap interface and extends AbstractMap class. 
	 * 2. It contains only unique elements.
	 * 3. It cannot have null key but can have multiple null values.
	 * 4. It is same as HashMap instead maintains ascending order(Sorted using the natural order of its key.).
	 * 
	 * HashTable:
	 * 1. A Hashtable is an array of list. Each list is known as a bucket. 
	 * The position of bucket is identified by calling the hashcode()
	 * method. A Hashtable contains values based on the key. 
	 * 2. It contains only unique elements. 
	 * 3. It may have not have any null key or value.
	 * 4. It is synchronized.
	 * 5. It is a legacy class.
	 */

	public static void main(String[] args) {

		HashMap<String, String> m = new HashMap<String, String>();
		m.put("c1", "a");
		m.put("c2", "b");
		m.put("c3", "c");
		m.put("c4", "d");
		m.put("c5", "e");
		System.out.println("hashMap: " + m);

		TreeMap<String, String> t = new TreeMap<String, String>();
		t.put("c1", "a");
		t.put("c2", "b");
		t.put("c3", "c");
		t.put("c4", "d");
		t.put("c5", "e");
		System.out.println("treeMap: " + t);

		LinkedHashMap<String, String> l = new LinkedHashMap<String, String>();
		l.put("c1", "a");
		l.put("c2", "b");
		l.put("c3", "c");
		l.put("c4", "d");
		l.put("c5", "e");
		System.out.println("linkedHash: " + l);

	}

}

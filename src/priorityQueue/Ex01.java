package priorityQueue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Ex01 {

	/**
	 * PriorityQueue useful functionalities
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Queue<String> pq = new PriorityQueue<String>();

		pq.add("White");
		pq.add("Black");
		pq.add("Green");
		pq.add("Yellow");
		pq.add("Purple");

		// Print the PriorityQueue
		System.out.println("PriorityQueue: " + pq);
		System.out.println("===");

		// Loop through each value in the PriorityQueue
		Iterator<String> itr = pq.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("===");

		// Write a Java program to add all the elements of a priority queue
		// to another priority queue.
		Queue<String> pq2 = new PriorityQueue<String>(pq);
		System.out.println(pq2);
		System.out.println("===");

		// Compare two queues' elements
		Iterator<String> itr1 = pq.iterator();
		Iterator<String> itr2 = pq2.iterator();
		int matchFlag = 0;
		while (itr1.hasNext()) {
			if (itr1.next().equals(itr2.next())) {
				matchFlag++;
			}
		}
		System.out.println(
				matchFlag == pq.size() && matchFlag == pq2.size() ? "Both pq and pq2 queues are equal." : "False");
		System.out.println("===");

		// Remove all the elements of pq2
		pq2.removeAll(pq2);
		System.out.println("Removed all the elements of pq2: " + pq2);
		System.out.println("===");

		// Count the number of the elements in pq
		System.out.println("Number of elements in pq: " + pq.size());
		System.out.println("===");

		// Retrieve the first element of the priority queue
		System.out.println("element: " + pq.element()); // throws an exception
		System.out.println("peek: " + pq.peek()); // doesn't throw an exception
		System.out.println("queue: " + pq);
		System.out.println("===");

		// Retrieve and remove the first element of the priority queue
		System.out.println("Poll: " + pq.poll()); // doesn't throw an exception
		System.out.println("Remove: " + pq.remove()); // throws an exception
		System.out.println(pq);
		System.out.println("===");

		// Convert a queue to an arraylist and loop through elements
		List<String> pql = new ArrayList<String>(pq);
		Iterator<String> itr3 = pql.iterator();
		while (itr3.hasNext()) {
			System.out.println(itr3.next());
		}
		System.out.println("===");

		// Print everything as string
		String s = pq.toString();
		System.out.println(s.getClass());
		System.out.println(s);
		System.out.println("===");

		// Loop through each element reversed order
		Queue<Integer> pq3 = new PriorityQueue<Integer>();

		pq3.add(1);
		pq3.add(2);
		pq3.add(3);
		pq3.add(4);

		LinkedList<Integer> pq3l = new LinkedList<Integer>(pq3);
		Iterator<Integer> itr4 = pq3l.descendingIterator();
		while (itr4.hasNext()) {
			System.out.println(itr4.next());
		}
		System.out.println("===");

	}
}

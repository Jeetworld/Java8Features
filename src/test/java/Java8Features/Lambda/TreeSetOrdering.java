package Java8Features.Lambda;

import java.util.*;

public class TreeSetOrdering {

	public static void main(String[] args) {
		
		//7. Create a TreeSet that sorts the given set of numbers in reverse order
		TreeSet<Integer> set = new TreeSet<Integer>((a, b)->b.compareTo(a));
		set.add(66);
		set.add(84);
		set.add(74);
		set.add(2);
		set.add(66);
		
		System.out.println("Reverse order "+set);

		//8. Create a TreeSet that sorts the given set of Employees in the alphabetic order of their name		
		TreeSet<String> nameSet = new TreeSet<String>();
		
		nameSet.add("Arav");
		nameSet.add("Basu");
		nameSet.add("Zebra");
		nameSet.add("Monkey");
		
		System.out.println("Alphabetical Order :: "+ nameSet);
		
		//9. Create a TreeMap that sorts the given set of values in decending order
		TreeSet<String> tree = new TreeSet<String>((a, b)->b.compareTo(a));
		tree.add("Apple");
		tree.add("Zebra");
		tree.add("Monkey");
		tree.add("Cat");
		
		System.out.println("Decending order :: "+tree);
		
		
	}

}

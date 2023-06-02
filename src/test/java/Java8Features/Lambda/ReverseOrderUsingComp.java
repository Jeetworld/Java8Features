package Java8Features.Lambda;

import java.util.Collections;
import java.util.Comparator;
import java.util.*;

public class ReverseOrderUsingComp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//5. Use Comparator inerface to sort given list of numbers in reverse order
	
		 ArrayList<Integer> list=new ArrayList<Integer>();
			list.add(11);
			list.add(1);
			list.add(71);
			list.add(9);
			list.add(0);
			list.add(100);
			list.add(88);
			
			//one way to do that
			 Collections.sort(list, (o1, o2) -> (o2.compareTo(o1)));	//bec COllections.sort() accepts list and comparator
		     System.out.println("Descending order => " + list);
			
		     //second way to do that
		     Collections.sort(list, new MyComparator());
		     System.out.println("Descending order => " + list);
		     
		     //third way to do 
		     Comparator<Integer> c = (o1,o2) -> (o1<o2)?1:(o1>o2)?-1:0;
		     Collections.sort(list, c);
		     System.out.println("Descending order => " + list);

	}

}

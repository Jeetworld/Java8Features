package Java8Features.Lambda;
import java.util.*;
public class WaysToIterateInJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> countries = Arrays.asList("Germany", "Panama", "Australia");
		
		
		//#1 Baisc for loop
		for (int i = 0; i < countries.size(); i++) {
		    System.out.println(countries.get(i));
		}
		
		
		//#2 Enhanced for loop
		for (String country : countries) {
		    System.out.println(country); 
		}
		
		//#3 Iterator
		Iterator<String> countriesIterator = countries.iterator();

		while(countriesIterator.hasNext()) {
		    System.out.println(countriesIterator.next()); 
		}
		
		
		//#4 ListIterator
		ListIterator<String> listIterator = countries.listIterator();

		while(listIterator.hasNext()) {
		    System.out.println(listIterator.next());
		}
		
		//#5 for Each
		countries.forEach(System.out::println);
		
		//#6 stream for each
		countries.stream().forEach((c) -> System.out.println(c));
		
		

	}

}

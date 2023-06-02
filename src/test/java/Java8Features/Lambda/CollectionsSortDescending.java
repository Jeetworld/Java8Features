package Java8Features.Lambda;
import java.util.*;
public class CollectionsSortDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//11. Use Collections.Sort to sort the given list of Employees in decending order of their name

		List<String> name = new ArrayList<String>();
		name.add("ronu");
		name.add("googy");
		name.add("appy");
		
		System.out.println("Before sorting in decending order "+ name);
		Collections.sort(name);
		System.out.println("Sorting in Ascending order "+name);
		Collections.sort(name, (x,y) -> (y.compareTo(x)));
		System.out.println("Sorting in Decending order "+ name);
		
		

	}

}

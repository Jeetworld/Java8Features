package Java8Features.Streams;
import java.util.*;
import java.util.stream.Collectors;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(22);
		list.add(67);
		list.add(4);
		list.add(2);
		list.add(12);
		list.add(45);
		
		List<Integer> li = list.stream().filter(x-> x%2==0).collect(Collectors.toList());
		
		System.out.println(li);
		li.forEach(System.out::println);

	}

}

package Java8Features.Predicate;

import java.util.function.Predicate;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> p1 = x -> x>20;
		
		System.out.println(p1.test(23));	//true

	}

}

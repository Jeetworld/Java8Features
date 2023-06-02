package Java8Features.Lambda;

import java.util.function.Predicate;

public class PredicateFunctions {

	public static void testFunction(Predicate<Integer> predicate, int [] numbersArray) {
		//for(int num)
	}
	public static void main(String[] args) {
		Predicate<Integer> predicate = a ->(a>10);
		//predicate.test("Wasim");
		System.out.println(predicate.test(10));
		System.out.println(predicate.test(200));
	}

}

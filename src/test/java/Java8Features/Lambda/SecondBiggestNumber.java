package Java8Features.Lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SecondBiggestNumber {

	//2. Find the 2nd biggest number in the given list of numbers
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(9,242,500,144,12,0,53,89);
		
		int secondLargestNumber = numbers
								  .stream().sorted(Collections.reverseOrder())
								  .skip(1)
								  .findFirst()
								  .get();
		
		
		System.out.println("Second larget number is "+ secondLargestNumber);		
	}

}

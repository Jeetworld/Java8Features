package Java8Features.Primitive;

import java.util.function.IntPredicate;

public class IntPredicateTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Write an IntPredicate to verify if the given number is a primenumber
		IntPredicate ip = x -> {
			boolean flag = true;
			if(x%2==0) {
				
			}else
				flag = false;
			
			return flag;
			
		};
		
		System.out.println("Your given no is "+ip.test(4));
	}

}

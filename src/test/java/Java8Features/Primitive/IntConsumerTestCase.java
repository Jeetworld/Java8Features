package Java8Features.Primitive;

import java.util.function.IntConsumer;

public class IntConsumerTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntConsumer ic = x -> {
			System.out.println(x*x);
		};
		
		//System.out.println("Square of given no is "+ ic.accept(4));
		ic.accept(4);

	}

}

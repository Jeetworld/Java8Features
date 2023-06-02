package Java8Features.BiFunction;

import java.util.function.BiFunction;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiFunction<Integer, Integer, Integer> bi = (x,y) -> {
			
			return x+y;
		};
		
		System.out.println(bi.apply(4, 9));
	}

}

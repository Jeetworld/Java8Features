package Java8Features.Primitive;
import java.util.Random;   

import java.util.function.IntSupplier;

public class IntSupplierTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3. Write a IntSupplier to give random int below 5000. 
		IntSupplier is = () -> {
			Random y = new Random();
			//System.out.println(y.nextInt(5000));
			return y.nextInt(5000);
		};
		
		System.out.println(is.getAsInt());
		

	}

}

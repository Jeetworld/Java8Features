package Java8Features.ConsumerSupplier;

import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.Random;

import Java8Features.Predicate.Products;

public class SupplierTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Products> list = new ArrayList<>();
		list.add(new Products("Apple", 1000, "CategoryA", "GradeA"));
		list.add(new Products("Samsung", 400, "CategoryF", "GradeA"));
		list.add(new Products("Vivo", 2000, "CategoryB", "GradeC"));
		list.add(new Products("Oppo", 3000, "CategoryA", "GradeV"));
		list.add(new Products("OnePlus", 5000, "CategoryA", "GradeD"));
		
		Supplier<String> supp = () -> {
			Random random = new Random();
			int length = list.size();
			int randomNumber = 0;
			randomNumber = random.nextInt(length);		
			String name = list.get(randomNumber).getName();
			System.out.println(randomNumber + " : " +name);
			return name;
			
		};
		
		supp.get();
		
		
		
		Supplier<String> otpSupplier = () -> {
			StringBuilder otp = new StringBuilder();
			Random random = new Random();
			for (int i = 0; i < 6; i++) {
				int randomNumber = random.nextInt(9);
				otp.append(randomNumber);
			}
			System.out.println(otp.toString());
			return otp.toString();
		};

		otpSupplier.get();
	}

}

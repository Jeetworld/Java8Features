package Java8Features.Function;

import java.util.ArrayList;
import java.util.function.Function;

import Java8Features.Predicate.Products;

public class FunctionTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		ArrayList<Products> list = new ArrayList<>();
		list.add(new Products("Arav", 1000, "CategoryA", "GradeA"));
		list.add(new Products("Roohani", 400, "CategoryF", "GradeA"));
		list.add(new Products("Hritik", 2000, "CategoryB", "GradeC"));
		list.add(new Products("Aryan", 3000, "CategoryA", "GradeV"));
		list.add(new Products("Yuvaan", 5000, "CategoryA", "GradeD"));
		
		Function<Products, Boolean> f1 = x -> x.getPrice() > 1000 ;
		Function<Products, Boolean> f2 = y -> y.getCategory().equalsIgnoreCase("CategoryA");
		Function<Products, Boolean> f3 = x -> x.getPrice() > 1000 && x.getCategory().equalsIgnoreCase("CategoryA") ;
		
		
		//2. Write a function to calculate the cost of all products whose prices is > 1000/- in the given list of products.
		for(Products pro :list) {
			if(f1.apply(pro)) {
				System.out.println("Name "+ pro.getName() + " Price :: "+ pro.getPrice()+" Category :: "+ pro.getCategory());
			}
		}
		
		//3. Write a function to calculate the cost of all electronic products in the given list of products.
		for(Products pro :list) {
			if(f2.apply(pro)) {
				System.out.println("Name "+ pro.getName() + " Price :: "+ pro.getPrice()+" Category :: "+ pro.getCategory());
			}
		}
		
		
		//4. Write a function to get all the products whose price is is > 1000/- and belongs to electronic category.
		for(Products pro :list) {
			if(f3.apply(pro)) {
				System.out.println("Name "+ pro.getName() + " Price :: "+ pro.getPrice()+" Category :: "+ pro.getCategory());
			}
		}

	}

}

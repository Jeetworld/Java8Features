package Java8Features.BiFunction;

import java.util.ArrayList;
import java.util.function.BiFunction;

import Java8Features.Predicate.Products;

public class BiFunctionTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2. Given the Product and quantity of the products, write a BiFunction to calculate the cost of products. 
		//A cart is a map of product and quantity. Given the cart, calculate the cost of the cart. 
		ArrayList<Products> list = new ArrayList<>();
		list.add(new Products("Apple", 1000, "CategoryA", "GradeA"));
		list.add(new Products("Samsung", 4000, "CategoryF", "GradeA"));
		list.add(new Products("Vivo", 2000, "CategoryB", "GradeC"));
		list.add(new Products("Oppo", 3000, "CategoryA", "GradeV"));
		list.add(new Products("OnePlus", 5000, "CategoryA", "GradeD"));
		
		BiFunction<ArrayList<Products>, Integer, Integer> biF = (list1, cost) -> {
			int sum =0;
			for(Products prod : list1) {
				sum = sum + prod.getPrice();
			}
			return sum;
			
		};
		
		System.out.println(biF.apply(list, 22));

	}

}

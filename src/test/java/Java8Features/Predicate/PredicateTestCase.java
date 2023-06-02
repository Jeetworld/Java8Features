package Java8Features.Predicate;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Products> list = new ArrayList<>();
		list.add(new Products("Arav", 100, "CategoryA", "GradeA"));
		list.add(new Products("Roohani", 400, "CategoryF", "GradeA"));
		list.add(new Products("Hritik", 200, "CategoryB", "GradeC"));
		list.add(new Products("Aryan", 1000, "CategoryA", "GradeV"));
		list.add(new Products("Yuvaan", 500, "CategoryA", "GradeD"));
		
		Predicate<Products> p3 = x -> x.getCategory().equalsIgnoreCase("CategoryA");
		Predicate<Products> p4 = y -> y.getPrice() > 200;
		

		
		//1: 2. Define a predicate to check if the product is of electronics category.
		//Print all the products from the given list of the products if the product is of electronics category.
		for(Products pro : list) {
			if(p3.test(pro)) {
				System.out.println("Name "+ pro.getName() + " Price :: "+ pro.getPrice()+" Category :: "+ pro.getCategory());
			}
		}
		
		
		//1. Define a predicate to check if the price of given product is greaterthan 1000/-. 
		//Print all the products from the given list of the products if the price is greaterthan 1000/-.
		for(Products pro : list) {
			if(p4.test(pro)) {
				System.out.println("Name "+ pro.getName() + " Price :: "+ pro.getPrice()+" Category :: "+ pro.getCategory());
			}
		}
		
		//3. Print all the products from the given list of product 
		//if the product price is greaterthan 100/- which are in electronics category.
		for(Products pro : list) {
			if((p3.and(p4)).test(pro)) {
				System.out.println("NameYOYO "+ pro.getName() + " Price :: "+ pro.getPrice()+" Category :: "+ pro.getCategory());
			}
		}
		
		
	}

}

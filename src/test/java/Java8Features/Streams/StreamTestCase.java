package Java8Features.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import Java8Features.Predicate.Products;

public class StreamTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Products> list = new ArrayList<>();
		list.add(new Products("Samsung", 100, "Electronics", "GradeA"));
		list.add(new Products("Micromax", 400, "CategoryF", "GradeA"));
		list.add(new Products("Apple", 200, "Electronics", "GradeC"));
		list.add(new Products("Oppo", 1000, "Electronics", "GradeV"));
		list.add(new Products("Vivo", 500, "CategoryA", "GradeD"));
		
		
		//1. From the given list of the products get all the products with price > 1000/- 

		List<Products> li = list.stream().filter( x  ->  x.getPrice() >100).collect(Collectors.toList());
		
		for(Products pro : li) {
			System.out.println("Name "+ pro.getName() + " Price :: "+ pro.getPrice()+" Category :: "+ pro.getCategory());
		}
		
		
		//2. From the given list of the products get all the products from electronics category.
		List<Products> li1 = list.stream().filter( x  ->  x.getCategory()=="Electronics").collect(Collectors.toList());
		
		for(Products pro : li1) {
			System.out.println("Name "+ pro.getName() + " Price :: "+ pro.getPrice()+" Category :: "+ pro.getCategory());
		}
		
		
		//3. From the given list of the products get all the products with price> 1000/- and 
		//from electronics category. Change the name of the result list into CAP letters before printing.
		List<Products> li3 = list.stream().filter( x  ->  x.getCategory()=="Electronics" &&  x.getPrice() >100).collect(Collectors.toList());
		
		for(Products pro : li3) {
			System.out.println("Name "+ pro.getName().toUpperCase() + " Price :: "+ pro.getPrice()+" Category :: "+ pro.getCategory());
		}
		
		//4. Calculate the count of all electronic products in the given list of products. 
		List<Products> li4 = list.stream().filter( x  ->  x.getCategory()=="Electronics").collect(Collectors.toList());
		
		for(Products pro : li4) {
			System.out.println("COUNT IS "+li4.size()+ " Name "+ pro.getName() + " Price :: "+ pro.getPrice()+" Category :: "+ pro.getCategory());
		}

	}

}

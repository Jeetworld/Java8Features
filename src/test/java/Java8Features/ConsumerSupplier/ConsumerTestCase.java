package Java8Features.ConsumerSupplier;

import java.util.ArrayList;
import java.util.function.Consumer;

import Java8Features.Predicate.Products;

public class ConsumerTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Products> list = new ArrayList<>();
		list.add(new Products("Apple", 1000, "CategoryA", "GradeA"));
		list.add(new Products("Samsung", 400, "CategoryF", "GradeA"));
		list.add(new Products("Vivo", 2000, "CategoryB", "GradeC"));
		list.add(new Products("Oppo", 3000, "CategoryA", "GradeV"));
		list.add(new Products("OnePlus", 5000, "CategoryA", "GradeD"));
		
		Consumer<Products> c1 = x -> {
			if(x.getPrice() > 1000) {
				x.setGrade("Premium");
			}
		};
		
		Consumer<Products> c2 = x -> {
			if(x.getPrice() > 3000) {
				x.setName(x.getName() + "AClass");
			}
		};
		
		Consumer<Products> c3 = x -> {
			if(x.getName().contains("AClass")) {
				System.out.println("Name "+ x.getName() + " Price :: "+ x.getPrice()+" Category :: "+ x.getCategory());
			}
		};
		
		
		//2. Write a Consumer to update the grade of the product as 'Premium' if the price is > 1000/-. 
		//Given the product list, update the grade for each product and print all of the products. 
		for(Products pro : list) {
			if(pro.getPrice() >1000) {
				c1.accept(pro);
				System.out.println("Name "+ pro.getName() + " Price :: "+ pro.getPrice()+" Category :: "+ pro.getCategory() + " Grade :: "+pro.getGrade());
			}
		}
		
		//3. Write a Consumer to update the name of the product to be suffixed with '*' if the price of product is > 3000/-. 
		//Given the product list, update the name for each product and print all of the products. 
		for(Products pro : list) {
			if(pro.getPrice() >3000) {
				c2.accept(pro);
				System.out.println("Name "+ pro.getName() + " Price :: "+ pro.getPrice()+" Category :: "+ pro.getCategory());
			}
		}
		
		
		//4. Print all the Premium grade products with name suffixed with '*'.
		for(Products pro : list) {
			System.out.println("============================");
			c3.accept(pro);
		}
		
		

	}

}

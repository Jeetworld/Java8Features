package Java8Features.Predicate;

public class Products {

	private String name;
	private int price;
	private String category;
	private String grade;
	
	public Products(String name, int price, String category, String grade) {
		this.name= name;
		this.price =price;
		this.category = category;
		this.grade = grade;
		
	}
	
	public String getName() {
		return name;
	}	
	
	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}	

	public String getCategory() {
		return category;
	}
	
	public String getGrade() {
		return grade;
	}
	
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
}

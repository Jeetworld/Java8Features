package Java8Feature.MethodReference;

public class Employee {
	
	private String name;
	private int account;
	private int salary;
	Employee(String name, int account, int salary){
		this.name = name;
		this.account = account;
		this.salary = salary;
		System.out.println("Constructor is executed from Empoyee class with Name ::"+name+ " accoutn "+ account+ "salary "+salary);
	}

}

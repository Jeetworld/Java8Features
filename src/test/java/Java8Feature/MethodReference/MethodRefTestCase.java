package Java8Feature.MethodReference;

public class MethodRefTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceEMP obj = Employee::new;
		
		obj.emp("KamaljitSingh", 1100, 10000);

	}

}

package Java8Features.Lambda;



public class LambdaExp {

	public static void main(String[] args) {
		int aa =90;
		InterfaceOne i = () -> {
			int bb =90;
			bb=100;
			//aa=88;
			System.out.println("Hello World !! This is from Lambda Exp");
			
		};
		
		i.interfaceMethod();
		
	}
}

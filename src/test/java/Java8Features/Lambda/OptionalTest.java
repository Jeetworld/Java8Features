package Java8Features.Lambda;

import java.util.Optional;

public class OptionalTest {

	public static void main(String[] args) {
		Optional <String> empty = Optional.of("Raul");
		System.out.println(empty.isPresent());
		System.out.println(empty.get());

	}

}

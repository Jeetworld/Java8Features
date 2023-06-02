package Java8Features.Lambda;

import java.util.function.Function;
import java.util.stream.IntStream;

public class PallindromeString {

	//1. Check if a given string is a palindrome
	public static void main(String[] args) {
		System.out.println("FIRST METHOD The given string is pallindrome or not :: "+isPallindromeString("DAD"));
		

		Function<String, Boolean> pr = str -> {
			String rev = "";
			boolean value =true;
				for(int i=str.length()-1; i>=0; i--) {
					rev = rev + str.charAt(i);
				}
				if(str.equals(rev)) {
					//System.out.println("Pallindrom no");
				}
				else {
					value= false;
				}
				
				return value;
		};
		
		System.out.println("SECOND METHOD Ouput is " +pr.apply("POPP"));
		System.out.println("SECOND METHOD Ouput is " +pr.apply("POP"));
		System.out.println("SECOND METHOD Ouput is " +pr.apply("helleh"));
	}

	public static boolean isPallindromeString(String inputString) {
		String temp = inputString.replaceAll("\\s", "").toLowerCase();
		boolean pallindromeOrNot = IntStream.range(0, temp.length()/2).allMatch(i -> temp.charAt(i)==temp.charAt(temp.length()-i-1));
		return pallindromeOrNot;
	}
}

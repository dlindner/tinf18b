package de.dhbw.tinf18.varianz;

import java.util.Arrays;
import java.util.List;

public class Liskov {

	public static void main(String[] args) {
		Integer[] intsArray = {1, 2, 3};
		
		List<Integer> ints = Arrays.asList(1, 2, 3);
		List<Double> doubles = Arrays.asList(1.5, 2.5, 3.5);
		
		Number[] numberArray = intsArray; // Co-Variant
		
		List<Number> numbers = null;
		
		//List<Number> numbers = ints; // Invariant
		List<? extends Number> covariant = ints; // Co-Variant
		List<? super Integer> contravariant = numbers; // Contra-Variant
	}
}

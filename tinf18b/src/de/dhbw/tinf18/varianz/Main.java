package de.dhbw.tinf18.varianz;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Integer[] iZahlen = new Integer[] { 1, 2, 3, };
		Number[] iAuchZahlen = iZahlen;
		
		List<Integer> zahlen = Arrays.asList(1, 2, 3);
		//List<Number> auchZahlen = zahlen; <-- geht nicht (Invariant)
		
		List<? extends Number> auchZahlen2 = zahlen;

		List<Object> test = null;
		List<? super Number> auchZahlen3 = test;
	}
}

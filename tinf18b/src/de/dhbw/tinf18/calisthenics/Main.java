package de.dhbw.tinf18.calisthenics;

import java.util.HashMap;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) {
		int step = 23;
		switch (step) {
		case 1:
			System.out.println("Hello, world");
			break;
		case 2:
			System.out.println("Hello again");
			break;
		case 17:
			System.out.println("Goodbye");
			break;
		default:
			System.err.println("Error: invalid step");
		}
		
		final Map<Integer, Aussage> aussagen = new HashMap<>();
		aussagen.put(1, () -> System.out.println("Hello, world"));
		aussagen.put(2, () -> System.out.println("Hello again"));
		aussagen.put(17, () -> System.out.println("Goodbye"));
		final Aussage aussage = aussagen.getOrDefault(step, () -> System.err.println("Error: invalid step"));
		aussage.gibAn();
	}
	
	private static interface Aussage {
		public void gibAn();
	}
}

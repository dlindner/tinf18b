package de.dhbw.tinf18.pattern.design.dekorierer;

public class Hund implements Lebewesen {
	
	public Hund() {
		super();
	}
	
	@Override
	public void tueEtwas() {
		System.out.println("Wuff! Wau!");
	}
}

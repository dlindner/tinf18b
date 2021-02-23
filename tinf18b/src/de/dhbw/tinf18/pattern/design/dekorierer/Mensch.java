package de.dhbw.tinf18.pattern.design.dekorierer;

public class Mensch implements Lebewesen {
	
	public Mensch() {
		super();
	}
	
	@Override
	public void tueEtwas() {
		//new Throwable().printStackTrace();
		System.out.println("Ich zahle meine Steuern gerne.");
	}
}

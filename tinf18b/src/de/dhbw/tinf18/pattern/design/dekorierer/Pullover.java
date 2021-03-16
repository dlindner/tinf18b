package de.dhbw.tinf18.pattern.design.dekorierer;

public class Pullover extends LebewesenDekorierer {
	
	public Pullover(Lebewesen nachfolger) {
		super(nachfolger);
	}
	
	@Override
	public void tueEtwas() {
		System.out.println("Pulli wärmt vorher.");
		super.tueEtwas();
		System.out.println("Pulli wärmt nachher.");
	}
}

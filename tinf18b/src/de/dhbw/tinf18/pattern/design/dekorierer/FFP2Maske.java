package de.dhbw.tinf18.pattern.design.dekorierer;

public class FFP2Maske extends LebewesenDekorierer {
	
	public FFP2Maske(Lebewesen nachfolger) {
		super(nachfolger);
	}
	
	@Override
	public void tueEtwas() {
		super.tueEtwas();
		System.out.println("Die Maske hat beschützt.");
	}
}

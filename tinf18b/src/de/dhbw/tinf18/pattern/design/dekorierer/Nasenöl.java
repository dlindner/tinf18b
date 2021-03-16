package de.dhbw.tinf18.pattern.design.dekorierer;

public class Nasenöl extends LebewesenDekorierer {
	
	public Nasenöl(Lebewesen nachfolger) {
		super(nachfolger);
	}
	
	@Override
	public void tueEtwas() {
		System.out.println("Das Orangenaroma schützt bereits vorher!");
		super.tueEtwas();
	}
}

package de.dhbw.tinf18.pattern.design.dekorierer;

public class Nasen�l extends LebewesenDekorierer {
	
	public Nasen�l(Lebewesen nachfolger) {
		super(nachfolger);
	}
	
	@Override
	public void tueEtwas() {
		System.out.println("Das Orangenaroma sch�tzt bereits vorher!");
		super.tueEtwas();
	}
}

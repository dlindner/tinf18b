package de.dhbw.tinf18.pattern.design.dekorierer;

public abstract class LebewesenDekorierer implements Lebewesen {
	
	private Lebewesen nachfolger;
	
	public LebewesenDekorierer(Lebewesen nachfolger) {
		super();
		this.nachfolger = nachfolger;
	}
	
	@Override
	public void tueEtwas() {
		this.nachfolger.tueEtwas();
	}
	
	public void wechsleNachfolger(Lebewesen neuerNachfolger) {
		this.nachfolger = neuerNachfolger;
	}
}

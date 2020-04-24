package de.dhbw.tinf18.intro;

public final class Rechenzentrum {
	
	public Rechenzentrum() {
		super();
	}
	
	public void lassLaufen(final Streamingdienst dienst) {
		System.out.println("R1: Verbrauche eine Menge Bandbreite.");
	}
	
	public void lassLaufen(final AlfaView dienst) {
		System.out.println("R2: Der Server überhitzt.");
	}
	
	public void lassLaufen(final Youtube dienst) {
		System.out.println("R3: Ja, sind wir Google oder was?");
	}
}

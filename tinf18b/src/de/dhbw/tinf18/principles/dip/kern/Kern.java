package de.dhbw.tinf18.principles.dip.kern;

public class Kern {
	
	private final Wurzler zieher;

	public Kern(Wurzler zieher) {
		super();
		this.zieher = zieher;
	}

	public void berechne() {
		double gartenfläche = 484;
		double seitenlänge = this.zieher.wurzelAus(gartenfläche);
		System.out.println(seitenlänge);
	}
}

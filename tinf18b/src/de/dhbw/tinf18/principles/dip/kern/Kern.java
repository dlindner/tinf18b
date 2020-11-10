package de.dhbw.tinf18.principles.dip.kern;

public class Kern {
	
	private final Wurzler zieher;

	public Kern(Wurzler zieher) {
		super();
		this.zieher = zieher;
	}

	public void berechne() {
		double gartenfl�che = 484;
		double seitenl�nge = this.zieher.wurzelAus(gartenfl�che);
		System.out.println(seitenl�nge);
	}
}

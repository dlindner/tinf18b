package de.dhbw.tinf18.pattern.design.beobachter;

public class Innenraumbeleuchtung implements Öffnungssensor {
	
	private Kofferraum raum;

	public Innenraumbeleuchtung(Kofferraum raum) {
		super();
		this.raum = raum;
	}
	
	@Override
	public void zustandAnders(boolean istOffen) {
		if (istOffen) {
			System.out.println("Es werde Licht!");
			return;
		}
		System.out.println("Dunkelheit.");
		this.raum.meldeAb(this);
	}
}

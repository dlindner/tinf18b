package de.dhbw.tinf18.pattern.design.beobachter;

public class Auto {

	private final Kofferraum hinten;
	private final Warnleuchte vorne;
	
	public Auto() {
		super();
		this.hinten = new Kofferraum();
		this.vorne = new Warnleuchte();
		this.hinten.meldeAn(this.vorne);
		this.hinten.meldeAn(new Innenraumbeleuchtung(this.hinten));
		this.hinten.meldeAn(new Innenraumbeleuchtung(this.hinten));
		this.hinten.meldeAn(new Innenraumbeleuchtung(this.hinten));
		this.hinten.meldeAn(new Innenraumbeleuchtung(this.hinten));
	}
	
	public void hintenAuf() {
		this.hinten.öffne();
	}
	
	public void hintenZu() {
		this.hinten.schließe();
	}
}

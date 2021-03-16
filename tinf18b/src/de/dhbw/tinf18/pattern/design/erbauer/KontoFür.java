package de.dhbw.tinf18.pattern.design.erbauer;

public class KontoF�r {
	
	private Inhaber inhaber;
	private �berziehungsrahmen dispo;
	private �berziehzins dispozins;
	private Kontof�hrungsgeb�hren geb�hren;
	private Pr�mie pr�mie;
	private Verwahrungsgeld strafzins;
	private Kontofabrik instanzersteller;

	private KontoF�r() {
		super();
		this.inhaber = new Inhaber(
				"Max Mustermann",
				Alter.vollj�hrig,
				new Kreditw�rdigkeit() {});
		this.dispo = new �berziehungsrahmen() {};
		this.dispozins = new �berziehzins() {};
		this.geb�hren = new Kontof�hrungsgeb�hren() {};
		this.pr�mie = Pr�mie.keine;
		this.strafzins = new Verwahrungsgeld() {};
		this.instanzersteller = Konto::new;
	}
	
	public static KontoF�r jugendkonten() {
		KontoF�r erbauer = new KontoF�r();
		erbauer.mitFabrik((i, d, dz, g, p, s) -> new JugendKonto(i, d, dz, g, p, s));
		return erbauer;
	}
	
	public static KontoF�r erwachsenenkonten() {
		KontoF�r erbauer = new KontoF�r();
		return erbauer;
	}
	
	public KontoF�r f�rMinderj�hrigenInhaber() {
		this.inhaber = new Inhaber(
				"Max Musterm�nnchen",
				Alter.minderj�hrig,
				new Kreditw�rdigkeit() {});
		this.pr�mie = Pr�mie.sporttasche;
		this.dispo = new �berziehungsrahmen() {};
		return this;
	}
	
	public KontoF�r mitFabrik(Kontofabrik neu) {
		this.instanzersteller = neu;
		return this;
	}
	
	// Fluent interface
	public KontoF�r mitInhaber(Inhaber neu) {
		this.inhaber = neu;
		return this;
	}
	
	// Fluent interface
	public KontoF�r mitPr�mie(Pr�mie neu) {
		this.pr�mie = neu;
		return this;
	}
	
	public Konto erstelle() {
		return this.instanzersteller.erstelleF�r(
				this.inhaber,
				this.dispo,
				this.dispozins,
				this.geb�hren,
				this.pr�mie,
				this.strafzins);
	}
}

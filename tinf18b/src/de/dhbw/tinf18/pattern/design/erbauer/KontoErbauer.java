package de.dhbw.tinf18.pattern.design.erbauer;

public class KontoErbauer {
	
	private Inhaber inhaber;
	private �berziehungsrahmen dispo;
	private �berziehzins dispozins;
	private Kontof�hrungsgeb�hren geb�hren;
	private Pr�mie pr�mie;
	private Verwahrungsgeld strafzins;

	public KontoErbauer() {
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
	}
	
	public KontoErbauer f�rMinderj�hrigenInhaber() {
		this.inhaber = new Inhaber(
				"Max Musterm�nnchen",
				Alter.minderj�hrig,
				new Kreditw�rdigkeit() {});
		this.pr�mie = Pr�mie.sporttasche;
		this.dispo = new �berziehungsrahmen() {};
		return this;
	}
	
	// Fluent interface
	public KontoErbauer mitInhaber(Inhaber neu) {
		this.inhaber = neu;
		return this;
	}
	
	// Fluent interface
	public KontoErbauer mitPr�mie(Pr�mie neu) {
		this.pr�mie = neu;
		return this;
	}
	
	public Konto build() {
		return new Konto(
				this.inhaber,
				this.dispo,
				this.dispozins,
				this.geb�hren,
				this.pr�mie,
				this.strafzins);
	}
}

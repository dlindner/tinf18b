package de.dhbw.tinf18.pattern.design.erbauer;

public class KontoFür {
	
	private Inhaber inhaber;
	private Überziehungsrahmen dispo;
	private Überziehzins dispozins;
	private Kontoführungsgebühren gebühren;
	private Prämie prämie;
	private Verwahrungsgeld strafzins;
	private Kontofabrik instanzersteller;

	private KontoFür() {
		super();
		this.inhaber = new Inhaber(
				"Max Mustermann",
				Alter.volljährig,
				new Kreditwürdigkeit() {});
		this.dispo = new Überziehungsrahmen() {};
		this.dispozins = new Überziehzins() {};
		this.gebühren = new Kontoführungsgebühren() {};
		this.prämie = Prämie.keine;
		this.strafzins = new Verwahrungsgeld() {};
		this.instanzersteller = Konto::new;
	}
	
	public static KontoFür jugendkonten() {
		KontoFür erbauer = new KontoFür();
		erbauer.mitFabrik((i, d, dz, g, p, s) -> new JugendKonto(i, d, dz, g, p, s));
		return erbauer;
	}
	
	public static KontoFür erwachsenenkonten() {
		KontoFür erbauer = new KontoFür();
		return erbauer;
	}
	
	public KontoFür fürMinderjährigenInhaber() {
		this.inhaber = new Inhaber(
				"Max Mustermännchen",
				Alter.minderjährig,
				new Kreditwürdigkeit() {});
		this.prämie = Prämie.sporttasche;
		this.dispo = new Überziehungsrahmen() {};
		return this;
	}
	
	public KontoFür mitFabrik(Kontofabrik neu) {
		this.instanzersteller = neu;
		return this;
	}
	
	// Fluent interface
	public KontoFür mitInhaber(Inhaber neu) {
		this.inhaber = neu;
		return this;
	}
	
	// Fluent interface
	public KontoFür mitPrämie(Prämie neu) {
		this.prämie = neu;
		return this;
	}
	
	public Konto erstelle() {
		return this.instanzersteller.erstelleFür(
				this.inhaber,
				this.dispo,
				this.dispozins,
				this.gebühren,
				this.prämie,
				this.strafzins);
	}
}

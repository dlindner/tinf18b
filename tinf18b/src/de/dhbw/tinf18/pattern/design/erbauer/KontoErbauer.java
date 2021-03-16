package de.dhbw.tinf18.pattern.design.erbauer;

public class KontoErbauer {
	
	private Inhaber inhaber;
	private Überziehungsrahmen dispo;
	private Überziehzins dispozins;
	private Kontoführungsgebühren gebühren;
	private Prämie prämie;
	private Verwahrungsgeld strafzins;

	public KontoErbauer() {
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
	}
	
	public KontoErbauer fürMinderjährigenInhaber() {
		this.inhaber = new Inhaber(
				"Max Mustermännchen",
				Alter.minderjährig,
				new Kreditwürdigkeit() {});
		this.prämie = Prämie.sporttasche;
		this.dispo = new Überziehungsrahmen() {};
		return this;
	}
	
	// Fluent interface
	public KontoErbauer mitInhaber(Inhaber neu) {
		this.inhaber = neu;
		return this;
	}
	
	// Fluent interface
	public KontoErbauer mitPrämie(Prämie neu) {
		this.prämie = neu;
		return this;
	}
	
	public Konto build() {
		return new Konto(
				this.inhaber,
				this.dispo,
				this.dispozins,
				this.gebühren,
				this.prämie,
				this.strafzins);
	}
}

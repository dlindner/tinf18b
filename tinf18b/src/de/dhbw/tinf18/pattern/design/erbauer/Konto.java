package de.dhbw.tinf18.pattern.design.erbauer;

public class Konto {
	
	private final Inhaber inhaber;
	private final Überziehungsrahmen dispo;
	private final Überziehzins dispozins;
	private final Kontoführungsgebühren gebühren;
	private final Prämie prämie;
	private final Verwahrungsgeld strafzins;

	public Konto(
			Inhaber inhaber,
			Überziehungsrahmen dispo,
			Überziehzins dispozins,
			Kontoführungsgebühren gebühren,
			Prämie prämie,
			Verwahrungsgeld strafzins) {
		super();
		this.inhaber = inhaber;
		this.dispo = dispo;
		this.dispozins = dispozins;
		this.gebühren = gebühren;
		this.prämie = prämie;
		this.strafzins = strafzins;
	}
}

package de.dhbw.tinf18.pattern.design.erbauer;

public class Konto {
	
	private final Inhaber inhaber;
	private final �berziehungsrahmen dispo;
	private final �berziehzins dispozins;
	private final Kontof�hrungsgeb�hren geb�hren;
	private final Pr�mie pr�mie;
	private final Verwahrungsgeld strafzins;

	public Konto(
			Inhaber inhaber,
			�berziehungsrahmen dispo,
			�berziehzins dispozins,
			Kontof�hrungsgeb�hren geb�hren,
			Pr�mie pr�mie,
			Verwahrungsgeld strafzins) {
		super();
		this.inhaber = inhaber;
		this.dispo = dispo;
		this.dispozins = dispozins;
		this.geb�hren = geb�hren;
		this.pr�mie = pr�mie;
		this.strafzins = strafzins;
	}
}

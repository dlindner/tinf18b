package de.dhbw.tinf18.pattern.design.erbauer;

public class JugendKonto extends Konto {

	public JugendKonto(Inhaber inhaber, �berziehungsrahmen dispo, �berziehzins dispozins,
			Kontof�hrungsgeb�hren geb�hren, Pr�mie pr�mie, Verwahrungsgeld strafzins) {
		super(inhaber, dispo, dispozins, geb�hren, Pr�mie.zeitschrift, strafzins);
	}
}

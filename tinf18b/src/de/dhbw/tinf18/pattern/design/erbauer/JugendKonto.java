package de.dhbw.tinf18.pattern.design.erbauer;

public class JugendKonto extends Konto {

	public JugendKonto(Inhaber inhaber, Überziehungsrahmen dispo, Überziehzins dispozins,
			Kontoführungsgebühren gebühren, Prämie prämie, Verwahrungsgeld strafzins) {
		super(inhaber, dispo, dispozins, gebühren, Prämie.zeitschrift, strafzins);
	}
}

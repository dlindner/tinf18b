package de.dhbw.tinf18.pattern.design.erbauer;

public interface Kontofabrik {

	Konto erstelleFür(Inhaber inhaber,
			Überziehungsrahmen dispo,
			Überziehzins dispozins,
			Kontoführungsgebühren gebühren,
			Prämie prämie,
			Verwahrungsgeld strafzins);
}

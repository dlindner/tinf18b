package de.dhbw.tinf18.pattern.design.erbauer;

public interface Kontofabrik {

	Konto erstelleF�r(Inhaber inhaber,
			�berziehungsrahmen dispo,
			�berziehzins dispozins,
			Kontof�hrungsgeb�hren geb�hren,
			Pr�mie pr�mie,
			Verwahrungsgeld strafzins);
}

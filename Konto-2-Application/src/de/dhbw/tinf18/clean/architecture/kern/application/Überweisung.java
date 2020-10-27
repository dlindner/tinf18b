package de.dhbw.tinf18.clean.architecture.kern.application;

import de.dhbw.tinf18.clean.architecture.kern.domain.Konto;

public final class �berweisung {
	
	private �berweisung() {
		super();
	}
	
	public static void f�r(
			Konto herkunft,
			Konto ziel,
			int betrag) {
		herkunft.buchen(-betrag);
		ziel.buchen(betrag);
	}
}

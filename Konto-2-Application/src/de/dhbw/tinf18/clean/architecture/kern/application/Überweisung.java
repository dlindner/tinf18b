package de.dhbw.tinf18.clean.architecture.kern.application;

import de.dhbw.tinf18.clean.architecture.kern.domain.Konto;

public final class Überweisung {
	
	private Überweisung() {
		super();
	}
	
	public static void für(
			Konto herkunft,
			Konto ziel,
			int betrag) {
		herkunft.buchen(-betrag);
		ziel.buchen(betrag);
	}
}

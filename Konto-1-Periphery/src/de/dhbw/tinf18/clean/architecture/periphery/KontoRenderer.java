package de.dhbw.tinf18.clean.architecture.periphery;

import de.dhbw.tinf18.clean.architecture.kern.domain.Konto;

public class KontoRenderer {

	public KontoRenderer() {
		super();
	}
	
	private String alsText(int zahl) {
		return "<em>" + zahl + " €</em>";
	}
	
	public String rendere(Konto konto) {
		int aktuell = konto.stand();
		return alsText(aktuell);
	}
}

package de.dhbw.tinf18.pattern.design.erbauer;

public class Main {

	public static void main(String[] args) {
		Konto zuTesten = KontoF�r.jugendkonten()
								.mitPr�mie(Pr�mie.armbanduhr)
								.erstelle();
		//zuTesten.setInhaber(new Inhaber(null, null, null));
	}
}

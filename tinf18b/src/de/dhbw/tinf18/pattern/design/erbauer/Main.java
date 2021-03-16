package de.dhbw.tinf18.pattern.design.erbauer;

public class Main {

	public static void main(String[] args) {
		Konto zuTesten = KontoFür.jugendkonten()
								.mitPrämie(Prämie.armbanduhr)
								.erstelle();
		//zuTesten.setInhaber(new Inhaber(null, null, null));
	}
}

package de.dhbw.tinf18.pattern.design.erbauer;

public class Main {

	public static void main(String[] args) {
		Konto zuTesten = new KontoErbauer()
								.f�rMinderj�hrigenInhaber()
								.mitPr�mie(Pr�mie.armbanduhr)
								.mitInhaber(new Inhaber(null, null, null))
								.mitPr�mie(Pr�mie.sporttasche)
								.build();
		//zuTesten.setInhaber(new Inhaber(null, null, null));
	}
}

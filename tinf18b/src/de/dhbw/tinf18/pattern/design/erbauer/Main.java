package de.dhbw.tinf18.pattern.design.erbauer;

public class Main {

	public static void main(String[] args) {
		Konto zuTesten = new KontoErbauer()
								.fürMinderjährigenInhaber()
								.mitPrämie(Prämie.armbanduhr)
								.mitInhaber(new Inhaber(null, null, null))
								.mitPrämie(Prämie.sporttasche)
								.build();
		//zuTesten.setInhaber(new Inhaber(null, null, null));
	}
}

package de.dhbw.tinf18.pattern.design.fabrik;

public class Main {

	public static void main(String[] args) {
		EkligeSpeisenFabrik feinschmecker = erstelleFabrik();
		
		Getr�nk trinken = feinschmecker.erstelleGetr�nk();
		Essen hauptgang = feinschmecker.erstelleEssen();
		Nachtisch dessert = feinschmecker.erstelleNachtisch();
		S��igkeit zumMitnehmen = feinschmecker.erstelleS��igkeit();
	}

	/*
	 * fabrikmethode
	 */
	private static EkligeSpeisenFabrik erstelleFabrik() {
		return DeutscheEkligeSpeisenFabrik.erstelleF�rNorddeutschland();
	}
}

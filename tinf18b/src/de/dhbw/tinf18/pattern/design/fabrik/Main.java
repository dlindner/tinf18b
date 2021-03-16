package de.dhbw.tinf18.pattern.design.fabrik;

public class Main {

	public static void main(String[] args) {
		EkligeSpeisenFabrik feinschmecker = erstelleFabrik();
		
		Getränk trinken = feinschmecker.erstelleGetränk();
		Essen hauptgang = feinschmecker.erstelleEssen();
		Nachtisch dessert = feinschmecker.erstelleNachtisch();
		Süßigkeit zumMitnehmen = feinschmecker.erstelleSüßigkeit();
	}

	/*
	 * fabrikmethode
	 */
	private static EkligeSpeisenFabrik erstelleFabrik() {
		return DeutscheEkligeSpeisenFabrik.erstelleFürNorddeutschland();
	}
}

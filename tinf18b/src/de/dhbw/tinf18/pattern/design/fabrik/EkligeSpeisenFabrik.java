package de.dhbw.tinf18.pattern.design.fabrik;

public interface EkligeSpeisenFabrik {

	Getränk erstelleGetränk();
	
	Essen erstelleEssen();
	
	Nachtisch erstelleNachtisch();
	
	Süßigkeit erstelleSüßigkeit();
}

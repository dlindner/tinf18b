package de.dhbw.tinf18.principles.dip.periphery;

import de.dhbw.tinf18.principles.dip.kern.Wurzler;

public class WurzlerZuLibraryAdapter implements Wurzler {
	
	@Override
	public double wurzelAus(double zahl) {
		return Library.squareRoot(zahl);
	}
}
